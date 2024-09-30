package com.stock_control_system.stock_control_system.mappers;

import com.stock_control_system.stock_control_system.dto.StockOperationDTO;
import com.stock_control_system.stock_control_system.entities.StockOperationEntity;

public class StockOperationMapper {
    public StockOperationDTO toDTO(StockOperationEntity stockOperationEntity) {
        StockOperationDTO stockOperationDTO = new StockOperationDTO();
        stockOperationDTO.setId(stockOperationEntity.getId());
        stockOperationDTO.setOperation(stockOperationEntity.getOperation());
        stockOperationDTO.setQuantity(stockOperationEntity.getQuantity());
        return stockOperationDTO;
    }

    public StockOperationEntity toEntity(StockOperationDTO stockOperationDTO) {
        StockOperationEntity stockOperationEntity = new StockOperationEntity();
        stockOperationEntity.setId(stockOperationDTO.getId());
        stockOperationEntity.setOperation(stockOperationDTO.getOperation());
        stockOperationEntity.setQuantity(stockOperationDTO.getQuantity());
        return stockOperationEntity;
    }
}
