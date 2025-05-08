package com.projeto.engenharia.esiv_fatec.service;

import org.springframework.stereotype.Service;

import com.projeto.engenharia.esiv_fatec.model.User;
import com.projeto.engenharia.esiv_fatec.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> updateUser(Long id, User updatedUser) {
        return userRepository.findById(id).map(user -> {
            user.setUserName(updatedUser.getUserName());
            user.setPassword(updatedUser.getPassword());
            return userRepository.save(user);
        });
    }
}
