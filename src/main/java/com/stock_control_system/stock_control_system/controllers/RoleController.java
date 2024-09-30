package com.stock_control_system.stock_control_system.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/role")
public class RoleController {
//    @Autowired
//    private Role roleService;

    @GetMapping("/")
    public String index() {
        return "Role it's available";
    }
}
