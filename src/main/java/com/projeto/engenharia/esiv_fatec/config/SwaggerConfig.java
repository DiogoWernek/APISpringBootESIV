package com.projeto.engenharia.esiv_fatec.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("ESIV API")
                .version("1.0")
                .description("Documentação da API do projeto de engenharia da FATEC")
                .contact(new Contact()
                    .name("Seu Nome")
                    .email("seu@email.com")
                )
            );
    }
}
