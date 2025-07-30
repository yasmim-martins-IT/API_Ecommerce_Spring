package com.ecommerce.ecommerSpring.Components;

import java.util.List;

public class CardsDTO {

    private Long id;

    private Long clienteId;  // referência ao Cliente pelo ID

    private List<Long> productIds;  // lista de IDs dos produtos no card

    private int quantidade;

    public CardsDTO() {
    }

    public CardsDTO( Long clienteId, List<Long> productIds, int quantidade) {
        this.clienteId = clienteId;
        this.productIds = productIds;
        this.quantidade = quantidade;
    }

    // getters e setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public List<Long> getProductIds() {
        return productIds;
    }

    public void setProductIds(List<Long> productIds) {
        this.productIds = productIds;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
