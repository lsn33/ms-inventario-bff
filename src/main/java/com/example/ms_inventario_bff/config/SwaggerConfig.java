package com.example.ms_inventario_bff.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration


public class SwaggerConfig {
    @Bean
    public OpenAPI apiInfo(){
        return new OpenAPI()
                   .info(new Info().title("API de inventario (ms-inventario-bff) - Perfulandia")
                                    .description("Microservicio que gestiona la conexión directa y personalizada con el frontend.")
                                    .version("1.0.0"));
    }

}
