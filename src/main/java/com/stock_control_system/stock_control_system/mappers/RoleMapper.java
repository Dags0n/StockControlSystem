package com.stock_control_system.stock_control_system.mappers;

import com.stock_control_system.stock_control_system.dto.RoleDTO;
import com.stock_control_system.stock_control_system.entities.RoleEntity;

public class RoleMapper {
    public RoleDTO toDTO(RoleEntity role) {
        RoleDTO roleDTO = new RoleDTO();
        roleDTO.setId(role.getId());
        roleDTO.setName(role.getName());
        roleDTO.setDescription(role.getDescription());
        return roleDTO;
    }

    public RoleEntity toEntity(RoleDTO roleDTO) {
        RoleEntity roleEntity = new RoleEntity();
        roleEntity.setId(roleDTO.getId());
        roleEntity.setName(roleDTO.getName());
        roleEntity.setDescription(roleDTO.getDescription());
        return roleEntity;
    }
}
