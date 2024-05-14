package com.example.mspratos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Ingrediente {
    @Id
    private Long id;

    private String name;

    private int quantidade;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    public Ingrediente(Long id, String name, int quantidade) {
        this.id = id;
        this.name = name;
        this.quantidade = quantidade;
    }

    public Ingrediente() {
    }

}
