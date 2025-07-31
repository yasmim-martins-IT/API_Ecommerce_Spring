package com.ecommerce.ecommerSpring.repositors;

import com.ecommerce.ecommerSpring.Entity.Cards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Cards , Long> {
}
