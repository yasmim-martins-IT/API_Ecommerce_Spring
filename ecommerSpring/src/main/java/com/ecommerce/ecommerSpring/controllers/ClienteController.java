package com.ecommerce.ecommerSpring.controllers;


import com.ecommerce.ecommerSpring.Components.Cliente;
import com.ecommerce.ecommerSpring.Components.ClienteDTO;
import com.ecommerce.ecommerSpring.Components.ProductDTO;
import com.ecommerce.ecommerSpring.Components.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ecommerce.ecommerSpring.repositors.ClienteRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {
    @Autowired
    private ClienteRepository repository ;

    @GetMapping
    public List<Cliente> findAll(){
        List<Cliente>  result = repository.findAll();

        return result ;
    }

    @PostMapping
    public Cliente createCliente(@RequestBody ClienteDTO dto) {
        Cliente cliente = new Cliente(dto.getName(), dto.getEmail());
        return repository.save(cliente) ;
    }
}
