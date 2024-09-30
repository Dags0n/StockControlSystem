package com.stock_control_system.stock_control_system.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {
//    @Autowired
//    private ProductService productService;

    @GetMapping("/")
    public String index() {
        return "Product it's available";
    }
}
