package com.manuel.springboot.di.app.springboot_di;

import org.springframework.context.annotation.Bean;

//Borrar
public class secutityConfig {
    @Bean
    public SecurityFilterChain configure(HttpSecurity httpSecurity){
        httpSecurity
                .cors(cors - cors.configurationSource(corsConfig.corsConfigurationSource()))
                .authorizeHttp


    }
}
