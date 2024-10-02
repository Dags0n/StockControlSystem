package com.stockcontrol.stockcontrol.dtos;

import lombok.Data;

@Data
public class ProductDTO {
    private Long id;
    private String name;
    private String description;
    private double costPrice;
    private double salePrice;
    private int quantity;
}
