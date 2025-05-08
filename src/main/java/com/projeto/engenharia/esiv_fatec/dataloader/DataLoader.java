package com.projeto.engenharia.esiv_fatec.dataloader;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.projeto.engenharia.esiv_fatec.model.Company;
import com.projeto.engenharia.esiv_fatec.repository.CompanyRepository;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Company> companies = List.of(
            createCompany("Paulo Fagundes", "11223344000155", "Rua Antônio Primo Nalesso", "Vila Rubens", "Tech top", 1, "f", "18207385", "SP", "Itapetininga", "Sudeste", "Brasil", "1058", "11", "40028922", "2010-03-24", "www.techbr.com", "techbrasil@tech.com.br", true),
            createCompany("Luana Ribeiro", "99988877766", "Rua das Palmeiras 321", "Vila Nova", "Luana da Silva Ribeiro", 1, "r", "88000-000", "Santa Catarina", "Florianópolis", "Sul", "Brasil", "1058", "48", "32223344", "1990-07-28", "", "luana.ribeiro@gmail.com", true),
            createCompany("Soluções Alfa", "12345678000100", "Avenida Central 500", "Industrial", "Alfa Soluções em TI Ltda.", 1, "r", "70000-000", "Distrito Federal", "Brasília", "Centro-Oeste", "Brasil", "1058", "61", "33445566", "2015-11-05", "www.solucaoalfa.com.br", "suporte@solucoesalfa.com.br", false),
            createCompany("Carlos Moura", "11122233344", "Rua das Laranjeiras 67", "Zona Norte", "Carlos Alberto Moura", 1, "r", "05000-000", "São Paulo", "São Paulo", "Sudeste", "Brasil", "1058", "11", "911223344", "1987-02-11", "www.techbr.com", "carlos.moura@outlook.com", true),
            createCompany("Oficina do Saber", "99887766000112", "Rua do Conhecimento 89", "Educacional", "Oficina do Saber Cursos Ltda.", 1, "r", "60000-000", "Ceará", "Fortaleza", "Nordeste", "Brasil", "1058", "85", "988776655", "2018-09-10", "", "jow123.wernek@gmail.com", true),
            createCompany("Julia Almeida", "23456789000", "Avenida das Rosas 1040", "Jardins", "Julia de Almeida Costa", 1, "r", "01311-000", "São Paulo", "São Paulo", "Sudeste", "Brasil", "1058", "11", "998877665", "1993-08-12", "", "", true),
            createCompany("Paulo top", "54321098700", "Rua Professor Tostes", "Central", "Lucas Lindão", 1, "r", "68900022", "AP", "Macapá", "Sudeste", "Brasil", "1058", "21", "973004500", "1990-05-12", "", "", true),
            createCompany("Nina Borges", "33221100055", "Rua das Hortências 90", "Flores", "Nina Pereira Borges", 1, "f", "88001-300", "Santa Catarina", "Florianópolis", "Sul", "Brasil", "1058", "48", "984443322", "1996-12-21", "", "", true),
            createCompany("Inova Móveis", "55667788000177", "Avenida Industrial 300", "Zona Industrial", "Inova Indústria de Móveis Ltda.", 1, "x", "09999-000", "São Paulo", "Diadema", "Sudeste", "Brasil", "1058", "11", "40409999", "2000-01-01", "", "", true),
            createCompany("Delta Equipamentos", "44556677000122", "Rua das Engenharias 500", "Tecnologia", "Delta Equipamentos Industriais Ltda.", 1, "f", "92900-000", "Rio Grande do Sul", "Eldorado do Sul", "Sul", "Brasil", "1058", "51", "32445500", "1998-06-24", "", "", true),
            createCompany("Gláucia Ribeiro", "11221122112", "Rua Nova Esperança 20", "Jardim América", "Gláucia Maria Ribeiro", 1, "matriz", "04576-100", "São Paulo", "São Paulo", "Sudeste", "Brasil", "1058", "11", "31998888", "1991-10-17", "", "", true),
            createCompany("Montana Bikes", "99887766000111", "Rua da Aventura 1024", "Radical", "Montana Bikes Brasil Ltda.", 1, "matriz", "09800-000", "São Paulo", "São Bernardo do Campo", "Sudeste", "Brasil", "1058", "11", "43905000", "1995-03-24", "", "", true),
            createCompany("Montana Bikes - Filial", "99887766000200", "Rodovia Central KM 200", "Zona Rural", "Montana Bikes Brasil Ltda.", 2, "filial", "18540-000", "São Paulo", "Porto Feliz", "Sudeste", "Brasil", "1058", "11", "43905781", "2018-07-03", "", "", true),
            createCompany("VEGA AUTOS", "23456789000100", "Rua dos Motores 6751", "Automotiva", "Vega Automóveis do Brasil Ltda.", 1, "r", "83090-901", "Paraná", "São José dos Pinhais", "Sul", "Brasil", "1058", "41", "30412959", "2016-09-10", "", "", false),
            createCompany("Diogo Araujo Wernek", "47245804885", "Rua Antônio Primo Nalesso", "Vila Rubens", "", 0, "f", "18207385", "SP", "Itapetininga", "Sudeste", "Brasil", "15", "15", "997676890", "2005-06-17", "github.com/diogowernek", "diogo@wernek.com", true)
        );

        companyRepository.saveAll(companies);
    }

    private Company createCompany(String fantasyName, String cnpj, String street, String district, String legalName, int storeId, String type, String cep, String state, String city, String region, String countryDesc, String countryId, String phoneCode, String phone, String birthDate, String homePage, String email, boolean isActive) {
        Company company = new Company();
        company.setFantasyName(fantasyName);
        company.setCnpj(cnpj);
        company.setAddressStreet(street);
        company.setAddressDistrict(district);
        company.setLegalName(legalName);
        company.setStoreIdNumber(storeId);
        company.setType(type);
        company.setCEP(cep);
        company.setState(state);
        company.setCity(city);
        company.setRegion(region);
        company.setCountryDescription(countryDesc);
        company.setCountryId(countryId);
        company.setPhoneCode(phoneCode);
        company.setPhone(phone);
        company.setBirthDate(birthDate);
        company.setHomePage(homePage);
        company.setEmail(email);
        company.setActive(isActive);
        return company;
    }
}
