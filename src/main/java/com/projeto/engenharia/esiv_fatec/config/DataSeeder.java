package com.projeto.engenharia.esiv_fatec.config;

import com.projeto.engenharia.esiv_fatec.model.Company;
import com.projeto.engenharia.esiv_fatec.model.User;
import com.projeto.engenharia.esiv_fatec.repository.CompanyRepository;
import com.projeto.engenharia.esiv_fatec.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataSeeder {

    private final UserRepository userRepository;
    private final CompanyRepository companyRepository;

    public DataSeeder(UserRepository userRepository, CompanyRepository companyRepository) {
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
    }

    @PostConstruct
    public void seedData() {
        if (userRepository.count() == 0) {
            User user1 = new User();
            user1.setUserName("admin");
            user1.setPassword("123456");
            userRepository.save(user1);

            User user2 = new User();
            user2.setUserName("user");
            user2.setPassword("password");
            userRepository.save(user2);
        }

        if (companyRepository.count() == 0) {
            Company company = new Company();
            company.setFantasyName("Fatec Store");
            company.setCnpj("12345678901234");
            company.setAddressStreet("Rua Exemplo");
            company.setAddressDistrict("Centro");
            company.setLegalName("Fatec Comércio Ltda");
            company.setStoreIdNumber(1);
            company.setType("Loja Física");
            company.setCEP("12345-678");
            company.setState("SP");
            company.setCity("São Paulo");
            company.setRegion("Sudeste");
            company.setCountryDescription("Brasil");
            company.setCountryId("BR");
            company.setPhoneCode("+55");
            company.setPhone("11999999999");
            company.setBirthDate("2000-01-01");
            company.setHomePage("https://fatec.br");
            company.setEmail("contato@fatec.br");
            company.setActive(true);

            companyRepository.save(company);
        }
    }
}
