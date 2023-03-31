package com.enesbayram.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
		info = @Info(
				title = "First Swagger Project",
				version = "1.0.0",
				description = "This project is only learning for me",
				contact = @Contact(
						name = "Enes Bayram",
						email = "enesbayram166@gmail.com")))
public class SwaggerConfig {

}
