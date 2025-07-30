package com.ecommerce.ecommerSpring.Components;

import java.math.BigDecimal;

public class ProductDTO {

        public String nome;
        public BigDecimal preco;
        public int quantidadeDisponivel;

        // Getters e setters (recomendado para desserialização)
        public String getNome() { return nome; }
        public void setNome(String nome) { this.nome = nome; }

        public BigDecimal getPreco() { return preco; }
        public void setPreco(BigDecimal preco) { this.preco = preco; }

        public int getQuantidadeDisponivel() { return quantidadeDisponivel; }
        public void setQuantidadeDisponivel(int quantidadeDisponivel) { this.quantidadeDisponivel = quantidadeDisponivel; }


}
