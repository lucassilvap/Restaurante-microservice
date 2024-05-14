package com.example.mspratos.dto;

public class IngredienteDto {

    private String name;
    private int quantidade;

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

    public IngredienteDto(String name, int quantidade) {
        this.name = name;
        this.quantidade = quantidade;
    }

    public IngredienteDto() {
    }
}
