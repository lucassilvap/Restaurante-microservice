package com.example.mspedidos.service;

import com.example.mspedidos.dto.PedidoDto;
import com.example.mspedidos.kafkaProducerEnviarPedidoParaAcozinha.KafkaProducerEnviaPedidoParaACozinha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {


    @Autowired
    private KafkaProducerEnviaPedidoParaACozinha kafkaProducerEnviaPedidoParaACozinha;


    public void EnviarPedidoParaACozinha(PedidoDto pedidoDto){
           kafkaProducerEnviaPedidoParaACozinha.EnviarPedidoParaAcozinha(pedidoDto);
    }
}
