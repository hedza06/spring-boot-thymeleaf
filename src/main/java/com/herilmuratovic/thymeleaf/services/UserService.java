package com.herilmuratovic.thymeleaf.services;

import com.herilmuratovic.thymeleaf.entities.User;
import com.herilmuratovic.thymeleaf.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

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


    /**
     * Method for getting user by id
     *
     * @param id given user identifier
     * @return Optional of User Object
     */
    @Transactional(readOnly = true)
    public Optional<User> findById(Integer id) {
        return userRepository.findById(id);
    }
}
