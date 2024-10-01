package com.stock_control_system.stock_control_system.controllers;

import com.stock_control_system.stock_control_system.dto.UserDTO;
import com.stock_control_system.stock_control_system.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private UserService userService = new UserService();

    @GetMapping("/")
    public String index() {
        List<UserDTO> users = userService.getAllUsers();
        List<String> response = new ArrayList<String>();

        for (UserDTO user : users) {
            String tmpUser = String.format(
                "{ id: '%s', name: '%s', email: '%s'}", user.getId(), user.getName(), user.getEmail()
            );
            response.add(tmpUser);
        }

        return response.toString();
    }
}
