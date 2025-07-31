package com.ecommerce.ecommerSpring.controllers;

import com.ecommerce.ecommerSpring.Entity.ProductDTO;
import com.ecommerce.ecommerSpring.Entity.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ecommerce.ecommerSpring.repositors.ProductsRepository;

import java.util.List;
import java.util.Optional;

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
        Products product = new Products(dto.getNome(), dto.getPreco(), dto.getQuantidadeDisponivel() , dto.getImage());
        return repository.save(product);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteProduct(@RequestBody Long produtoId) {
        Optional<Products> produtoOptional = repository.findById(produtoId);
        if (produtoOptional.isPresent()) {
            repository.deleteById(produtoId);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }



}
