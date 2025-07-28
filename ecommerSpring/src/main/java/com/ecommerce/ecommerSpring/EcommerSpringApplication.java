package com.ecommerce.ecommerSpring;
import org.springframework.boot.autoconfigure.domain.EntityScan;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("Components")
@ComponentScan("controllers")
@EnableJpaRepositories("repositors")
public class EcommerSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(EcommerSpringApplication.class, args);
	}

}
