package com.ecommerce.ecommerSpring;
import org.springframework.boot.autoconfigure.domain.EntityScan;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EntityScan("Components")
public class EcommerSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(EcommerSpringApplication.class, args);
	}

}
