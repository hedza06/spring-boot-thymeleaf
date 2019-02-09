package com.herilmuratovic.thymeleaf.services;

import com.herilmuratovic.thymeleaf.entities.User;
import com.herilmuratovic.thymeleaf.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;


    /**
     * Method for getting all users
     *
     * @return List of User Objects
     */
    @Transactional(readOnly = true)
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
