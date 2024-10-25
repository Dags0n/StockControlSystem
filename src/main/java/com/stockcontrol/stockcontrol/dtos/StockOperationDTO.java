package com.stockcontrol.stockcontrol.dtos;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class StockOperationDTO {
    private Long id;
    private String operationType;
    private LocalDateTime operationDate;
    private int quantity;
    private Long userId;
    private Long storeId;
    private Long productId;

    public StockOperationDTO() {
        this.operationDate = LocalDateTime.now();
    }
}
