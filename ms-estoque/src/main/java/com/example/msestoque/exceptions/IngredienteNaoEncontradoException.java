package com.example.msestoque.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.server.ResponseStatusException;

public class IngredienteNaoEncontradoException extends ResponseStatusException {
    public IngredienteNaoEncontradoException() {
        super(HttpStatus.BAD_REQUEST, "Ingrediente não encontrado!!");
    }
}
