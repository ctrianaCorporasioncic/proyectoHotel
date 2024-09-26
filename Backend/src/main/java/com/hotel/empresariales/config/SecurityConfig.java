package com.hotel.empresariales.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // Desactivar CSRF para pruebas con Postman
        http.csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/crearClt").permitAll()  // Permitir acceso sin autenticación a este endpoint
                .anyRequest().authenticated()  // Requerir autenticación para otros endpoints
            );
        
        return http.build();
    }
}