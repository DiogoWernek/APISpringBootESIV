package com.projeto.engenharia.esiv_fatec.config;

import com.projeto.engenharia.esiv_fatec.model.User;
import com.projeto.engenharia.esiv_fatec.repository.CompanyRepository;
import com.projeto.engenharia.esiv_fatec.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataSeeder {

    private final UserRepository userRepository;

    public DataSeeder(UserRepository userRepository, CompanyRepository companyRepository) {
        this.userRepository = userRepository;
    }

    @PostConstruct
    public void seedData() {
        if (userRepository.count() == 0) {
            User user1 = new User();
            user1.setUserName("admin");
            user1.setPassword("$2a$12$d05DPCHCw1AQbUhCA7sDK.N7T8uHNDqryiXIAtn0Ssv14ZiT/3Y9q");
            userRepository.save(user1);

            User user2 = new User();
            user2.setUserName("user");
            user2.setPassword("$2a$12$d05DPCHCw1AQbUhCA7sDK.N7T8uHNDqryiXIAtn0Ssv14ZiT/3Y9q");
            userRepository.save(user2);
        }
    }
}   
