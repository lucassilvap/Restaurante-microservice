package com.example.mspedidos.service;

import com.example.mspedidos.entity.PedidoEntity;
import com.example.mspedidos.kafkaProducerEnviarPedidoParaAcozinha.KafkaProducerEnviaPedidoParaACozinha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {


    @Autowired
    private KafkaProducerEnviaPedidoParaACozinha kafkaProducerEnviaPedidoParaACozinha;


    public void EnviarPedidoParaACozinha(PedidoEntity pedidoEntity){
           kafkaProducerEnviaPedidoParaACozinha.EnviarPedidoParaAcozinha(pedidoEntity);
    }
}
