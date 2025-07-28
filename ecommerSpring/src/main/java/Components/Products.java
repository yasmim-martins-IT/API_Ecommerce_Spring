package Components;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity //cria uma entidade atraves do dacorator
@Table(name = "tb_products")

public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id ;

    @Getter
    private String nome ;

    @Getter
    private double preco ;

    @Getter
    private int quantidadeDisponivel ;

    public Products(){

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
