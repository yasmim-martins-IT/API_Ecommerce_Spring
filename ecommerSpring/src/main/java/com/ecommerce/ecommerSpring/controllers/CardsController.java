package com.ecommerce.ecommerSpring.controllers;

import com.ecommerce.ecommerSpring.Components.Cards;
import com.ecommerce.ecommerSpring.Components.CardsDTO;
import com.ecommerce.ecommerSpring.Components.Cliente;
import com.ecommerce.ecommerSpring.Components.Products;
import com.ecommerce.ecommerSpring.repositors.ClienteRepository;
import com.ecommerce.ecommerSpring.repositors.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ecommerce.ecommerSpring.repositors.CardRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/carrinho")
public class CardsController {

    @Autowired
    private CardRepository cardRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ProductsRepository productsRepository;

    @GetMapping
    public List<Cards> findAll(){
        return cardRepository.findAll();
    }

    @PostMapping
    public Cards createCard(@RequestBody CardsDTO dto) {
        Cliente cliente = clienteRepository.findById(dto.getClienteId())
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));

        List<Products> produtos = productsRepository.findAllById(dto.getProductIds());

        Cards card = new Cards();
        card.setClient(cliente);
        card.setProducts(produtos);
        card.setQuantidade(dto.getQuantidade());

        return cardRepository.save(card);
    }

    @DeleteMapping
    public ResponseEntity<Void> deletarCard (@RequestBody Long card_id) {
        Optional<Cards> cards = cardRepository.findById(card_id);

        if (cards.isPresent()) {
            cardRepository.deleteById(card_id);
            return ResponseEntity.noContent().build();
        }
        else {
            return ResponseEntity.notFound().build() ;
        }
    }
}
