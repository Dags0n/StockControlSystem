package com.stockcontrol.stockcontrol.controllers;

import com.stockcontrol.stockcontrol.services.ProductService;
import com.stockcontrol.stockcontrol.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private final UserService userService;
    private final ProductService productService;

    public IndexController(UserService userService, ProductService productService) {
        this.userService = userService;
        this.productService = productService;
    }

    @GetMapping
    public String showDashboard(Model model) {
        long totalUsers = userService.findAll().size();
        long totalProducts = productService.findAll().size();
        model.addAttribute("totalUsers", totalUsers);
        model.addAttribute("totalProducts", totalProducts);
        return "index";
    }
}
