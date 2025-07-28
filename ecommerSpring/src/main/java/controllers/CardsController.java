package controllers;

import Components.Cards;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repositors.CardRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/carrinho")
public class CardsController {

    @Autowired
    private CardRepository repository ;

    @GetMapping
    public List<Cards> findAll(){
        List<Cards> result = repository.findAll();
        return result;
    }

    @PostMapping
    public Cards createCard(@RequestBody Cards carrinho) {
        return repository.save(carrinho) ; 
    }
}
