package com.example.mspedidos.kafkaProducerEnviarPedidoParaAcozinha;

import com.example.mspedidos.entity.PedidoEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerEnviaPedidoParaACozinha {

    private static final String topic = "pedido-para-a-cozinha";

    private ObjectMapper mapper = new ObjectMapper();

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void EnviarPedidoParaAcozinha(PedidoEntity pedidoEntity){
        try {
            kafkaTemplate.send(topic, mapper.writeValueAsString(pedidoEntity));
            System.out.println("Pedido enviado com sucesso!!");
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
