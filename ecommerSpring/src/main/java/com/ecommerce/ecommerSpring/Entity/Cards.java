package com.ecommerce.ecommerSpring.Entity;
import java.util.List ;

import jakarta.persistence.*;


@Entity
@Table(name = "tb_Cards")
public class Cards {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @OneToOne
    @JoinColumn(name = "cliente_id")

    private Cliente client;

    @OneToMany
    @JoinColumn(name = "card_id")  // FK na tabela Products que referencia Cards

    private List<Products> products;

    public Cards() {}
    public Cards( Cliente client, List<Products> products, int quantidade) {
        this.client = client;
        this.products = products;
        this.quantidade = quantidade;
    }

    private int quantidade;

    // setters...
    public void setClient(Cliente client) {
        this.client = client;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }


    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Cliente getClient() {
        return client;
    }

    public List<Products> getProducts() {
        return products;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
