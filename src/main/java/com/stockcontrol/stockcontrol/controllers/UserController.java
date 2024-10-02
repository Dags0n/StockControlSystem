package com.stockcontrol.stockcontrol.controllers;

import com.stockcontrol.stockcontrol.dtos.UserDTO;
import com.stockcontrol.stockcontrol.entities.UserEntity;
import com.stockcontrol.stockcontrol.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String showUsers(Model model) {
        model.addAttribute("users", userService.findAll());
        return "user/userlist";
    }

    @GetMapping("/create")
    public String showCreateUserForm(Model model) {
        model.addAttribute("user", new UserEntity());
        return "user/usercreate";
    }

    @PostMapping
    public String createUser(@ModelAttribute("user") UserEntity user) {
        userService.create(user);
        return "redirect:/users";
    }

    @GetMapping("/update/{id}")
    public String showUpdateUserForm(@PathVariable Long id, Model model) {
        userService.findById(id).ifPresent(user -> model.addAttribute("user", user));
        return "user/userupdate";
    }

    @PostMapping("/update/{id}")
    public String updateUser(@PathVariable Long id, @ModelAttribute("user") UserDTO userDTO) {
        userService.update(id, userDTO);
        return "redirect:/users";
    }

    @PostMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.delete(id);
        return "redirect:/users";
    }

}
