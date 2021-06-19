package com.dihardmg.kayrawanapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.thymeleaf.dialect.springdata.SpringDataDialect;

@SpringBootApplication
public class SpinwheelAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpinwheelAppApplication.class, args);
	}
	@Bean
	public SpringDataDialect springDataDialect() {
		return new SpringDataDialect();
	}
}
