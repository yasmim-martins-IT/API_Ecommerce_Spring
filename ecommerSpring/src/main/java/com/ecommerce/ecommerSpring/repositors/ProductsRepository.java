package com.ecommerce.ecommerSpring.repositors;

import com.ecommerce.ecommerSpring.Entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<Products , Long> {
}
