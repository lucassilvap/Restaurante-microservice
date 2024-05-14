package com.example.mspratos.controller;

import com.example.mspratos.dto.IngredienteDto;
import com.example.mspratos.entity.Ingrediente;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PratosController {

    @PostMapping
    public ResponseEntity<?> saveIngrediente(@RequestBody IngredienteDto ingrediente){
        return ResponseEntity.ok(ingrediente);
    }

    @GetMapping("{id}")
    public ResponseEntity<?> buscarIngrediente(@PathVariable(name = "id") Long id){
      return ResponseEntity.ok(id);
    }

   @GetMapping("/nome/{nome}")
    public ResponseEntity<?> buscarIngredientePorNome(@PathVariable(name = "nome") String nome){
        return ResponseEntity.ok(nome);
   }



}
