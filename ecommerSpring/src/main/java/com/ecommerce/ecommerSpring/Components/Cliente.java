package com.ecommerce.ecommerSpring.Components;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "tb_clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id ;


    private String name ;


    private  String email;

    public  Cliente () {}
    public Cliente(String name ,String email ) {
        this.name = name;
        this.email = email ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
