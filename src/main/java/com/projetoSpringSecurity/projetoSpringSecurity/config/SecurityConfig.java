package com.projetoSpringSecurity.projetoSpringSecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.csrf(csrf -> csrf.disable()) // Desativa proteção CSRF (Para testes!!!)
				.authorizeHttpRequests(auth -> auth.requestMatchers("/api/encrypt/**").permitAll() // Libera a rota (Para testes!!!)
						.anyRequest().permitAll() // Libera qualquer rota (Para testes!!!)
				);
		return http.build();
	}

}
