package com.example.msestoque.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.server.ResponseStatusException;

public class IngredienteDeveSerUnicoException extends ResponseStatusException {

    public IngredienteDeveSerUnicoException() {
        super(HttpStatus.BAD_REQUEST, "Nome do ingrediente deve ser unico !!");
    }
}
