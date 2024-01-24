package com.Panashe.restaurant.management;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MenuConfig {

    @Bean
    CommandLineRunner commandLineRunner (MenuRepository repository){
        return args -> {
        };

    }
}
