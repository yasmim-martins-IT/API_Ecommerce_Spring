package com.ecommerce.ecommerSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // isso já faz o ComponentScan em subpacotes automaticamente
public class EcommerSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerSpringApplication.class, args);
	}

}
