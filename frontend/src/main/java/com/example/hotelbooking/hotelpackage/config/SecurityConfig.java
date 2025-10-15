package com.example.hotelbooking.hotelpackage.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                .requestMatchers(HttpMethod.POST, "/web/api/booking/**").permitAll()
                .requestMatchers(HttpMethod.DELETE, "/web/api/room/**").permitAll()
                .requestMatchers(HttpMethod.GET, "/web/api/booking/**").permitAll()
            );
        return http.build();
    }
}

