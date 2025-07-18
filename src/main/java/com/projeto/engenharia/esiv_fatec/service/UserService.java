package com.projeto.engenharia.esiv_fatec.service;

import org.springframework.stereotype.Service;

import com.projeto.engenharia.esiv_fatec.model.User;
import com.projeto.engenharia.esiv_fatec.repository.UserRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User createUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public Optional<User> updateUser(Long id, User updatedUser) {
        return userRepository.findById(id).map(user -> {
            user.setUserName(updatedUser.getUserName());

            user.setPassword(passwordEncoder.encode(updatedUser.getPassword()));

            return userRepository.save(user);
        });
    }
}
