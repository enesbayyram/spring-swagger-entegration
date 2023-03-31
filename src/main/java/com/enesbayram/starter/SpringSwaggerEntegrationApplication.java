package com.enesbayram.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.enesbayram"})
@SpringBootApplication
public class SpringSwaggerEntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSwaggerEntegrationApplication.class, args);
	}

}
