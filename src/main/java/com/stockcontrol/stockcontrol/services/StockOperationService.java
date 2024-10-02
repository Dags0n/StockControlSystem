package com.stockcontrol.stockcontrol.services;

import com.stockcontrol.stockcontrol.dtos.StockOperationDTO;
import com.stockcontrol.stockcontrol.entities.StockOperationEntity;
import com.stockcontrol.stockcontrol.repositories.StockOperationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StockOperationService {

    private final StockOperationRepository stockOperationRepository;

    public StockOperationService(StockOperationRepository stockOperationRepository) {
        this.stockOperationRepository = stockOperationRepository;
    }

    public List<StockOperationEntity> findAll() {
        return stockOperationRepository.findAll();
    }

    public Optional<StockOperationEntity> findById(Long id) {
        return stockOperationRepository.findById(id);
    }

    public StockOperationEntity create(StockOperationEntity stockOperation) {
        return stockOperationRepository.save(stockOperation);
    }

    public StockOperationEntity update(Long id, StockOperationDTO stockOperationDTO) {
        Optional<StockOperationEntity> optionalStockOperation = stockOperationRepository.findById(id);
        if (optionalStockOperation.isPresent()) {
            StockOperationEntity stockOperation = optionalStockOperation.get();
            stockOperation.setQuantity(stockOperationDTO.getQuantity());
            stockOperation.setOperationDate(stockOperationDTO.getOperationDate());
            stockOperation.setOperationType(stockOperationDTO.getOperationType());
            return stockOperationRepository.save(stockOperation);
        }
        return null;
    }

    public void delete(Long id) {
        stockOperationRepository.deleteById(id);
    }
}
