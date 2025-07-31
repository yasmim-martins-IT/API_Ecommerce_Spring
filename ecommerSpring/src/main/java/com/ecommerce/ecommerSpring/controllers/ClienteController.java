package com.ecommerce.ecommerSpring.controllers;


import com.ecommerce.ecommerSpring.Entity.Cliente;
import com.ecommerce.ecommerSpring.Entity.ClienteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ecommerce.ecommerSpring.repositors.ClienteRepository;

import java.util.List;
import java.util.Optional;

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

    @DeleteMapping
    public ResponseEntity<Void> deletarCliente (@RequestBody Long cliente_id){
        Optional<Cliente> cliente = repository.findById(cliente_id) ;

        if (cliente.isPresent()) {
            repository.deleteById(cliente_id);

            return  ResponseEntity.noContent().build();
        }
        else {
            return ResponseEntity.notFound().build() ;
        }
    }
}
