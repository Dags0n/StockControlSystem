package com.stock_control_system.stock_control_system.services;

import com.stock_control_system.stock_control_system.dto.UserDTO;
import com.stock_control_system.stock_control_system.entities.RoleEntity;
import com.stock_control_system.stock_control_system.entities.UserEntity;
import com.stock_control_system.stock_control_system.mappers.UserMapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserService {

    private final UserMapper userMapper = new UserMapper();

    public List<UserDTO> getAllUsers() {
        // TODO: puxar dados a partir do banco
        RoleEntity role = new RoleEntity("ADMIN", "");
        UserEntity user = new UserEntity("ADMIN", "admin", "admin", role);
        user.setId(1);
        UserEntity user2 = new UserEntity("ADMIN 2", "admin2", "admin", role);
        user2.setId(2);
        UserEntity user3 = new UserEntity("ADMIN 3", "admin3", "admin", role);
        user3.setId(3);

        return new ArrayList<UserDTO>(Arrays.asList(userMapper.toDTO(user), userMapper.toDTO(user2), userMapper.toDTO(user3)));
    }

    public UserDTO getUserById(int id) {
        // TODO: pegar usuario com base no ID
        return new UserDTO();
    }

    public UserDTO createUser(UserDTO userDTO) {
        // TODO: criar usuario no banco
        return new UserDTO();
    }

    public UserDTO updateUser(int id, UserDTO userDTO) {
        // TODO: atualizar dados do usuario no banco
        return new UserDTO();
    }

    public void deleteUser(int id) {
        // TODO: deletar usuario do banco
    }

}
