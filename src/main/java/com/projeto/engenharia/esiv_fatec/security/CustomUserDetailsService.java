package com.projeto.engenharia.esiv_fatec.security;

import com.projeto.engenharia.esiv_fatec.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepo.findByUserName(username)
                .map(user -> User.builder()
                        .username(user.getUserName())
                        .password(user.getPassword())
                        .roles("USER")
                        .build())
                .orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado"));
    }
}
