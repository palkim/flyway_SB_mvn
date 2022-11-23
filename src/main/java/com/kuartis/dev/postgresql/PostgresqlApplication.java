package com.kuartis.dev.postgresql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class PostgresqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostgresqlApplication.class, args);
	}

	@Configuration
	static class OktaOAuth2WebSecurityConfigurerAdapter {

		@Bean
    	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
			http
				.authorizeRequests().anyRequest().authenticated()
				.and()
				.oauth2ResourceServer().jwt();

        	return http.build();

    	}
		
	}

}
