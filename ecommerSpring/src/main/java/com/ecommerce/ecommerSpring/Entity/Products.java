package com.ecommerce.ecommerSpring.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;

@Entity
@Table(name = "tb_products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @NotBlank(message = "O nome do produto é obrigatório")
    @Size(max = 100, message = "O nome do produto deve ter no máximo 100 caracteres")
    @Column(nullable = false, length = 100)
    private String nome;

    @NotNull(message = "O preço é obrigatório")
    @DecimalMin(value = "0.0", inclusive = false, message = "O preço deve ser maior que zero")
    @Digits(integer = 10, fraction = 2, message = "Formato de preço inválido")
    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal preco;

    @Min(value = 0, message = "A quantidade não pode ser negativa")
    @Column(name = "quantidade_disponivel", nullable = false)
    private int quantidadeDisponivel;

    @NotNull(message = "A imagem é obrigatória")
    @Column(nullable = false , length = 500)
    private String image ;

    // Construtor padrão (sem argumentos)
    public Products() {
    }

    // Construtor com todos os campos (exceto id, que é gerado)
    public Products(String nome, BigDecimal preco, int quantidadeDisponivel , String image) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.image = image ;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    // Getters e setters (adicione manualmente ou gere pelo IDE)
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }
}
