package com.example.mspratos.service;

import com.example.mspratos.entity.Ingrediente;
import com.example.mspratos.exceptions.IngredienteNaoEncontradoExcepetion;
import com.example.mspratos.repository.IngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IngredienteService {

    @Autowired
    private IngredienteRepository ingredienteRepository;

    public void salvarIngrediente(Ingrediente ingredienteEntity){
              ingredienteRepository.save(ingredienteEntity);
    }

    public Ingrediente buscarIngredientePorId(Long id){
        Optional<Ingrediente> ingrediente = ingredienteRepository.findById(id);
        if(ingrediente.isPresent()) return ingrediente.get();
            throw new IngredienteNaoEncontradoExcepetion();
    }
    
}
