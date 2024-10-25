package com.stockcontrol.stockcontrol.controllers;

import com.stockcontrol.stockcontrol.dtos.StockOperationDTO;
import com.stockcontrol.stockcontrol.entities.StockOperationEntity;
import com.stockcontrol.stockcontrol.services.StockOperationService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/stock-operations")
public class StockOperationController {

    private final StockOperationService stockOperationService;

    public StockOperationController(StockOperationService stockOperationService) {
        this.stockOperationService = stockOperationService;
    }

    @GetMapping
    public String getAllStockOperations(Model model) {
        model.addAttribute("stock_operation", stockOperationService.findAll());
        return "stock-operation/operationlist";
    }

    @GetMapping("/{id}")
    public ResponseEntity<StockOperationEntity> getStockOperationById(@PathVariable Long id) {
        return stockOperationService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/create")
    public String showCreateStockOperationForm(Model model) {
        model.addAttribute("stock_operation", new StockOperationEntity());
        return "stock-operation/operationcreate";
    }

    @PostMapping
    public String createStockOperation(@ModelAttribute("stock_operation") StockOperationEntity stockOperation) {
        stockOperationService.create(stockOperation);
        return "redirect:/stock-operations";
    }

    @GetMapping("/update/{id}")
    public String showUpdateStockOperationForm(@PathVariable Long id, Model model) {
        stockOperationService.findById(id).ifPresent(stockOperation -> model.addAttribute("stock_operation", stockOperation));
        return "stock-operation/operationupdate";
    }

    @PostMapping("/update/{id}")
    public String updateStockOperation(@PathVariable Long id, @ModelAttribute("stock_operation") StockOperationDTO stockOperationDTO) {
        stockOperationService.update(id, stockOperationDTO);
        return "redirect:/stock-operations";
    }

    @PostMapping("/delete/{id}")
    public String deleteStockOperation(@PathVariable Long id) {
        stockOperationService.delete(id);
        return "redirect:/stock-operations";
    }
}
