package com.example.bookstoreapp;

import com.example.bookstoreapp.dao.entity.AuthorityEntity;
import com.example.bookstoreapp.dao.entity.UserEntity;
import com.example.bookstoreapp.dao.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Set;

@SpringBootApplication
@RequiredArgsConstructor
public class BookStoreAppApplication implements CommandLineRunner {

    private final UserRepository userRepository;

    private final BCryptPasswordEncoder passwordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(BookStoreAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        AuthorityEntity authority1 = new AuthorityEntity();
        authority1.setAuthority("USER");

        UserEntity user = new UserEntity();
        user.setUsername("user");
        user.setFirstName("John");
        user.setLastName("Wick");
        user.setEmail("TestingEmail@yahoo.com");
        user.setAge(19);
        user.setPassword(passwordEncoder.encode("user1234"));
        user.setAuthorities(Set.of(authority1));
        user.setAccountNonExpired(true);
        user.setCredentialsNonExpired(true);
        user.setAccountNonLocked(true);
        user.setEnabled(true);

        try {
            userRepository.save(user);
        } catch (Exception ex) {
            System.out.println("USER_ALREADY_EXIST");
        }
        AuthorityEntity authority2 = new AuthorityEntity();
        authority2.setAuthority("PUBLISHER");

        UserEntity userEntity = new UserEntity();
        userEntity.setUsername("publisher");
        userEntity.setFirstName("Somebody");
        userEntity.setLastName("Someone");
        userEntity.setEmail("TestEmail@gmail.com");
        userEntity.setAge(20);
        userEntity.setPassword(passwordEncoder.encode("publisher1234"));
        userEntity.setAuthorities(Set.of(authority2));
        userEntity.setAccountNonExpired(true);
        userEntity.setEnabled(true);
        userEntity.setCredentialsNonExpired(true);
        userEntity.setAccountNonLocked(true);
        try {
            userRepository.save(userEntity);
        } catch (Exception ex) {
            System.out.println("USER_ALREADY_EXIST");
        }
    }






}