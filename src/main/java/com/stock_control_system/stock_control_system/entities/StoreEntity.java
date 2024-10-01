package com.stock_control_system.stock_control_system.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Stores")
public class StoreEntity {
    @Id
    @Column(name = "id")
    private int id;
    private String name;
    private String address;

    @OneToMany(mappedBy = "store")
    private List<StockOperationEntity> stockOperations = new ArrayList<>();

    public StoreEntity() {
    }

    public StoreEntity(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
