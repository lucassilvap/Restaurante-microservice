package com.example.msestoque.controller;

import com.example.msestoque.dto.IngredienteDto;
import com.example.msestoque.entity.IngredienteEntity;
import com.example.msestoque.service.EstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EstoqueController {

     @Autowired
     private EstoqueService estoqueService;

     private IngredienteEntity ingredienteEntity;

     @PostMapping
     public ResponseEntity<?> salvarNovoIngrediente(@RequestBody IngredienteDto ingredienteDto) {
               ingredienteEntity = new IngredienteEntity
                       (ingredienteDto.getIngrediente(), ingredienteDto.getQuantidade());
               estoqueService.salvarIngrediente(ingredienteEntity);
              return ResponseEntity.ok(ingredienteEntity.getIngrediente() + " Salvo com sucesso!");
     }

     @GetMapping("{ingrediente}")
      public ResponseEntity<?> buscarIngrediente(@PathVariable(name = "ingrediente") String ingrediente){
         return ResponseEntity.ok(ingrediente);
     }

}
