package com.stock_control_system.stock_control_system.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/stock/operation")
public class StockOperationController {
//    @Autowired
//    private StockOperation stockOperationService;

    @GetMapping("/")
    public String index() {
        return "Stock Operations it's available";
    }
}
