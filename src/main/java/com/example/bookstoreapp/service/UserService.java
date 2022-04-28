package com.example.bookstoreapp.service;

import com.example.bookstoreapp.dao.repository.AuthorityRepository;
import com.example.bookstoreapp.dao.repository.UserRepository;
import com.example.bookstoreapp.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import com.example.bookstoreapp.model.dto.UserRegisterDto;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

    private final UserRepository userRepository;
    private final AuthorityRepository authorityRepository;
    private final BCryptPasswordEncoder encoder;


    public void registerUser(UserRegisterDto registerDto) {
        log.info("ActionLog.registerUser.start");

        var authority = authorityRepository.findByAuthority("USER");
        var entity = UserMapper.mapRegisterDtoToEntity(registerDto);
        entity.setPassword(encoder.encode(entity.getPassword()));
        entity.setAuthorities(Set.of(authority));

        userRepository.save(entity);
        log.info("ActionLog.registerUser.success");
    }


}
