package com.example.mspedidos.kafkaProducerEnviarEstoqueBaixaIngrediente;

import com.example.mspedidos.dto.PedidoDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerBaixaEstoque {

    private static final String topic = "dar-baixa-estoque";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void DarBaixaEstoque() {
            kafkaTemplate.send(topic, "pão");
            System.out.println("Pedido de dar baixa no estoque realizado com sucesso!");

    }
    
}
