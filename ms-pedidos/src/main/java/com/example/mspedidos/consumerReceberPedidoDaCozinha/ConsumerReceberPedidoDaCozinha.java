package com.example.mspedidos.consumerReceberPedidoDaCozinha;


import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerReceberPedidoDaCozinha {

    @KafkaListener(topics = "pedido-esta-pronto", groupId = "group_id")
    public void Consumer(String mensagem){
          System.out.println(mensagem);
    }
}
