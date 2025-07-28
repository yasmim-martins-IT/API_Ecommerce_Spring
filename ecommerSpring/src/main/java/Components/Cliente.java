package Components;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "tb_clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
   private Long id ;

    @Getter
    private String name ;

    @Getter
    private  String email;

    public Cliente(){}

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
