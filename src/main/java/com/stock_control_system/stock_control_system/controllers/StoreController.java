package com.stock_control_system.stock_control_system.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/store")
public class StoreController {
//    @Autowired
//    private StoreService storeService;

    @GetMapping("/")
    public String index() {
        return "Store it's available";
    }
}
