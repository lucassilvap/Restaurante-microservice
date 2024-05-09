package com.example.mscozinha.service;

import com.example.mscozinha.entity.PedidoEntity;
import com.example.mscozinha.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CozinhaService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public void salvarPedido(PedidoEntity pedidoEntity){
       pedidoRepository.save(pedidoEntity);
    }
}
