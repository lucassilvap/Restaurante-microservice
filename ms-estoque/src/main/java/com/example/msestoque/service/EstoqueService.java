package com.example.msestoque.service;

import com.example.msestoque.entity.IngredienteEntity;
import com.example.msestoque.exceptions.IngredienteNaoEncontradoException;
import com.example.msestoque.repository.EstoqueRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.parser.Entity;
import java.util.Optional;

@Service
public class EstoqueService {

    @Autowired
    private EstoqueRepository estoqueRepository;

    public void salvarIngrediente(IngredienteEntity ingredienteEntity){
        estoqueRepository.save(ingredienteEntity);
    }

    public IngredienteEntity procurarIngredientePorNome(String ingrediente){
          Optional<IngredienteEntity> entity = estoqueRepository.findByingrediente(ingrediente);
          if(entity.isPresent()) return entity.get();
          throw new IngredienteNaoEncontradoException();
    }

    public void modificarQuantidade(String ingrediente, int quantidade){
        IngredienteEntity entity = procurarIngredientePorNome(ingrediente);
        entity.setQuantidade(entity.getQuantidade() - quantidade);
        salvarIngrediente(entity);
    }

    @PostConstruct
    public void salvarIngredienteNoBanco(){
        IngredienteEntity entity = new IngredienteEntity("pão",100);
        salvarIngrediente(entity);
    }
}
