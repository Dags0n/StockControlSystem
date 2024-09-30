package com.stock_control_system.stock_control_system.services;

import com.stock_control_system.stock_control_system.dto.UserDTO;
import com.stock_control_system.stock_control_system.mappers.UserMapper;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private final UserMapper userMapper = new UserMapper();

    public List<UserDTO> getAllUsers() {
        // TODO: puxar dados a partir do banco
        return new ArrayList<UserDTO>();
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
