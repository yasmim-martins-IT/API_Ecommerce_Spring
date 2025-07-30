package com.ecommerce.ecommerSpring.controllers;

import com.ecommerce.ecommerSpring.Components.ProductDTO;
import com.ecommerce.ecommerSpring.Components.Products;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ecommerce.ecommerSpring.repositors.ProductsRepository;

import java.math.BigDecimal;
import java.util.List;

@RestController // DECLARA COMO UM CONTROLLER (RECEBE REQUISIÇÕES)
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductsRepository repository ;

    //metodo para listar todos os produtos :
    @GetMapping
    public List<Products> findAll () {
       List<Products> result = repository.findAll();

        return  result ;
    }

    @PostMapping
    public Products createProduct(@RequestBody ProductDTO dto) {
        Products product = new Products(dto.getNome(), dto.getPreco(), dto.getQuantidadeDisponivel());
        return repository.save(product);
    }



}
