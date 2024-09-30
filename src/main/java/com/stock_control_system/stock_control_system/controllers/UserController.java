package com.stock_control_system.stock_control_system.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
//    @Autowired
//    private UserService userService;

    @GetMapping("/")
    public String index() {
        return "User it's available";
    }
}
