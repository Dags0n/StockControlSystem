package com.stock_control_system.stock_control_system.mappers;

import com.stock_control_system.stock_control_system.dto.StoreDTO;
import com.stock_control_system.stock_control_system.entities.StoreEntity;

public class StoreMapper {
    public StoreDTO toDTO(StoreEntity store) {
        StoreDTO storeDTO = new StoreDTO();
        storeDTO.setId(store.getId());
        storeDTO.setName(store.getName());
        storeDTO.setAddress(store.getAddress());
        return storeDTO;
    }

    public StoreEntity toEntity(StoreDTO storeDTO) {
        StoreEntity storeEntity = new StoreEntity();
        storeEntity.setId(storeDTO.getId());
        storeEntity.setName(storeDTO.getName());
        storeEntity.setAddress(storeDTO.getAddress());
        return storeEntity;
    }
}
