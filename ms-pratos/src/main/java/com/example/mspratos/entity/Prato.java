package com.example.mspratos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Prato {

    @Id
    private Long id;

    private String nomePrato;

    @OneToMany
    private List<Ingrediente> ingrediente;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public List<Ingrediente> getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(List<Ingrediente> ingrediente) {
        this.ingrediente = ingrediente;
    }

    public Prato(String nomePrato, List<Ingrediente> ingrediente) {
        this.nomePrato = nomePrato;
        this.ingrediente = ingrediente;
    }

    public Prato() {
    }
}
