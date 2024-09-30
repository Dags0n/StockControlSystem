package com.stock_control_system.stock_control_system.mappers;

import com.stock_control_system.stock_control_system.dto.UserDTO;
import com.stock_control_system.stock_control_system.entities.UserEntity;

public class UserMapper {
    public UserDTO toDTO(UserEntity user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        userDTO.setEmail(user.getEmail());
        userDTO.setPassword(user.getPassword());
        return userDTO;
    }

    public UserEntity toEntity(UserDTO userDTO) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(userDTO.getId());
        userEntity.setName(userDTO.getName());
        userEntity.setEmail(userDTO.getEmail());
        userEntity.setPassword(userDTO.getPassword());
        return userEntity;
    }
}
