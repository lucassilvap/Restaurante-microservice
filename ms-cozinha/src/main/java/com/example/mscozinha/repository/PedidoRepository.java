package com.example.mscozinha.repository;

import com.example.mscozinha.entity.PedidoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends CrudRepository<PedidoEntity,Long> {

}
