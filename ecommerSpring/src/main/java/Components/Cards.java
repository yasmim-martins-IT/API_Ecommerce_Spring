package Components;
import java.util.List ;

import jakarta.persistence.*;
import lombok.Getter;


@Entity
@Table(name = "tb_Cards")
public class Cards {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @OneToOne
    @Getter
    private Cliente client;

    @OneToMany
    @JoinColumn(name = "card_id")  // FK na tabela Products que referencia Cards
    @Getter
    private List<Products> products;

    @Getter
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
}
