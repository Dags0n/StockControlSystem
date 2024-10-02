package com.stockcontrol.stockcontrol.services;

import com.stockcontrol.stockcontrol.dtos.UserDTO;
import com.stockcontrol.stockcontrol.entities.UserEntity;
import com.stockcontrol.stockcontrol.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserEntity> findAll() {
        return userRepository.findAll();
    }

    public Optional<UserEntity> findById(Long id) {
        return userRepository.findById(id);
    }

    public UserEntity create(UserEntity user) {
        return userRepository.save(user);
    }

    public UserEntity update(Long id, UserDTO userDTO) {
        Optional<UserEntity> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            UserEntity user = optionalUser.get();
            user.setName(userDTO.getName());
            user.setEmail(userDTO.getEmail());
            return userRepository.save(user);
        }
        return null;
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
