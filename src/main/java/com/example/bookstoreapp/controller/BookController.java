package com.example.bookstoreapp.controller;


import com.example.bookstoreapp.service.BookService;
import lombok.RequiredArgsConstructor;
import model.criteria.BookCriteria;
import model.criteria.PageCriteria;
import model.dto.BookDto;
import model.dto.PageableBookDto;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/books")
public class BookController {

    private final BookService bookService;

    @GetMapping
    @PreAuthorize("hasAnyAuthority('USER','PUBLISHER')")
    public PageableBookDto getAllBooksWhereNameLike(BookCriteria bookCriteria,
                                                    PageCriteria pageCriteria) {
        return bookService.getBooksWhereNameLike(bookCriteria, pageCriteria);
    }


    @PutMapping("/{bookId}/publishers/{publisherId}")
    @PreAuthorize("hasAuthority('PUBLISHER')")
    public void updateBook(@PathVariable Long bookId,
                           @PathVariable Long publisherId,
                           @RequestBody BookDto bookDto) {
        bookService.updateBook(bookId, publisherId, bookDto);
    }

}


