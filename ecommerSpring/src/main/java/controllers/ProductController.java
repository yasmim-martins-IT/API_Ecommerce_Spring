package controllers;

import Components.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repositors.ProductsRepository;

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
    public Products createProduct(@RequestBody Products product) {
        return repository.save(product);  // ERRO: método não estático chamado via classe
    }

}
