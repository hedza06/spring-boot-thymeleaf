package com.herilmuratovic.thymeleaf.controllers;

import com.herilmuratovic.thymeleaf.constants.TemplateConstant;
import com.herilmuratovic.thymeleaf.entities.User;
import com.herilmuratovic.thymeleaf.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping(value = "/users")
    public String getAllUsers(Model model)
    {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);

        return TemplateConstant.ALL_USERS;
    }
}
