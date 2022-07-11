package com.tandem6.nopostore.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi storeAPI() {
        return GroupedOpenApi.builder()
                .group("stores")
                .pathsToMatch("/stores/**")
                .build();
    }

    @Bean
    public GroupedOpenApi userAPI() {
        return GroupedOpenApi.builder()
                .group("users")
                .pathsToMatch("/users/**")
                .build();
    }

    @Bean
    public GroupedOpenApi allAPI() {
        return GroupedOpenApi.builder()
                .group("all")
                .pathsToMatch("/**")
                .build();
    }


    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info().title("Spring Boot API Example")
                        .description("Spring Boot API 예시 프로젝트입니다.")
                        .version("v0.0.1"));
    }
}
