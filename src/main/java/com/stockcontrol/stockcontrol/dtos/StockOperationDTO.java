package com.stockcontrol.stockcontrol.dtos;

import lombok.Data;

import java.util.Date;

@Data
public class StockOperationDTO {
    private Long id;
    private String operationType;
    private Date operationDate;
    private int quantity;
    private Long userId;
    private Long storeId;
    private Long productId;
}
