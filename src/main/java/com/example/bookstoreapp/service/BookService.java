package com.example.bookstoreapp.service;


import com.example.bookstoreapp.dao.repository.BookRepository;
import com.example.bookstoreapp.mapper.BookMapper;
import com.example.bookstoreapp.service.specification.BookSpecification;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import com.example.bookstoreapp.model.criteria.BookCriteria;
import com.example.bookstoreapp.model.criteria.PageCriteria;
import com.example.bookstoreapp.model.dto.BookDto;
import com.example.bookstoreapp.model.dto.PageableBookDto;
import com.example.bookstoreapp.model.exception.UpdateBookException;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import static com.example.bookstoreapp.model.constants.ExceptionConstants.*;


@Service
@RequiredArgsConstructor
@Slf4j
public class BookService {

    private final BookRepository bookRepository;


    public void updateBook(Long bookId, Long publisherId, BookDto bookDto) {
        log.info("ActionLog.updateBook.start publisherId: {}, bookId: {}", publisherId, bookId);

        var bookEntity = bookRepository.findByBookIdAndPublisherId(bookId, publisherId)
                .orElseThrow(() -> new UpdateBookException(BOOK_UPDATE_MESSAGE, BOOK_UPDATE_CODE));
        bookEntity.setName(bookDto.getName());
        bookEntity.setPublishingYear(bookDto.getPublishingYear());
        bookEntity.setPageCount(bookDto.getPageCount());

        log.info("ActionLog.updateBook.success publisherId: {}, bookId: {}", publisherId, bookId);
        bookRepository.save(bookEntity);
    }

    public PageableBookDto getBooksWhereNameLike(BookCriteria bookCriteria, PageCriteria pageCriteria) {
        log.info("ActionLog.getAllBooksPagination.start");

        var pageNumber = pageCriteria.getPage();
        var count = pageCriteria.getCount();

        Pageable pageRequest = PageRequest.of(pageNumber, count);
        var specification = new BookSpecification(bookCriteria);

        var bookPage = bookRepository.findAll(specification, pageRequest);
        var books = bookPage.getContent();
        var bookPageCounts = bookPage.getTotalPages();

        if (bookPageCounts != 0) {
            bookPageCounts -= 1;
        }
        log.info("ActionLog.getAllBooksPagination.success");
        return PageableBookDto.builder()
                .books(BookMapper.mapEntitiesToListDto(books))
                .lastPageNumber(bookPageCounts)
                .hasNextPage(bookPage.hasNext())
                .build();
    }


}







