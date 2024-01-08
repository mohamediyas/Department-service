package com.imthiyasSpring.Departmentservice;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Department Service Rest Apis",
				description = "Department Service Rest api documentation",
				version = "v1.0",
				contact = @Contact(
						name = "Mohamed imthiyas",
						email = "mohamedimthiyas@gmail.com",
						url = "https://www.google.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "www.google.com"
				)

		),
		externalDocs = @ExternalDocumentation(
				description = "Department service docs",
				url = "www.google.com"
		)
)
public class DepartmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

}

//department service
