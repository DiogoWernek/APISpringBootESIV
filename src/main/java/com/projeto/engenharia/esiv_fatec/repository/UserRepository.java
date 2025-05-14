package com.projeto.engenharia.esiv_fatec.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.engenharia.esiv_fatec.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserName(String userName);
}
