package controllers;


import Components.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repositors.ClienteRepository;

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
    public Cliente createCliente(@RequestBody Cliente cliente){
        return repository.save(cliente);
    }
}
