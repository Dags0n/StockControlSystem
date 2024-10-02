package com.stockcontrol.stockcontrol.controllers;

import com.stockcontrol.stockcontrol.dtos.StockOperationDTO;
import com.stockcontrol.stockcontrol.entities.StockOperationEntity;
import com.stockcontrol.stockcontrol.services.StockOperationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stock-operations")
public class StockOperationController {

    private final StockOperationService stockOperationService;

    public StockOperationController(StockOperationService stockOperationService) {
        this.stockOperationService = stockOperationService;
    }

    @GetMapping
    public List<StockOperationEntity> getAllStockOperations() {
        return stockOperationService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<StockOperationEntity> getStockOperationById(@PathVariable Long id) {
        return stockOperationService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public StockOperationEntity createStockOperation(@RequestBody StockOperationEntity stockOperation) {
        return stockOperationService.create(stockOperation);
    }

    @PutMapping("/{id}")
    public ResponseEntity<StockOperationEntity> updateStockOperation(@PathVariable Long id, @RequestBody StockOperationDTO stockOperationDTO) {
        StockOperationEntity updatedStockOperation = stockOperationService.update(id, stockOperationDTO);
        if (updatedStockOperation != null) {
            return ResponseEntity.ok(updatedStockOperation);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStockOperation(@PathVariable Long id) {
        stockOperationService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
