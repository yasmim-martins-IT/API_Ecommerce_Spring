package com.ecommerce.ecommerSpring.repositors;

import com.ecommerce.ecommerSpring.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente , Long> {
}
