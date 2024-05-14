package com.example.mspratos.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.server.ResponseStatusException;

public class IngredienteNaoEncontradoExcepetion extends ResponseStatusException {
    public IngredienteNaoEncontradoExcepetion() {
        super(HttpStatus.BAD_REQUEST, "id do ingrediente não encontrado");
    }
}
