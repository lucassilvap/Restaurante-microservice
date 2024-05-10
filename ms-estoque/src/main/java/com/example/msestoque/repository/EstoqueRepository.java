package com.example.msestoque.repository;

import com.example.msestoque.entity.IngredienteEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EstoqueRepository extends CrudRepository<IngredienteEntity, Long> {

    Optional<IngredienteEntity> findByingrediente(String ingrediente);
}
