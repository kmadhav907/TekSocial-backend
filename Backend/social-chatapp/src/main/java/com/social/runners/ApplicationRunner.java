package com.social.runners;

import com.social.model.UserModel;
import com.social.repositories.UserRepository;
import com.social.utility.GloblaUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

//@Component
public class ApplicationRunner implements org.springframework.boot.ApplicationRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Adding data to database");
        UserModel model = new UserModel();
        model.setEmail("richa@gmail.com");
        model.setUserCreatedAt(GloblaUtils.formatDateAndTime(LocalDateTime.now()));
        model.setUserUpdatedAt(GloblaUtils.formatDateAndTime(LocalDateTime.now()));
        userRepository.save(model);
        System.out.println("User created successfully");

    }
}
