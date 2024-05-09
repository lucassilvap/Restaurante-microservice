package com.example.mscozinha.consumerSeChegouAlgumPedidoParaAcozinha;

import com.example.mscozinha.entity.PedidoEntity;
import com.example.mscozinha.kafkaProducerSeOPedidoEstaPronto.PedidoEstaPronto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class ConsumerPedidoParaAcozinha {

    private ObjectMapper mapper = new ObjectMapper();

    @Autowired
    PedidoEstaPronto pedidoEstaPronto;


    @KafkaListener(topics = "pedido-para-a-cozinha", groupId = "group_id")
    public void Consumer(String mensagem){
        try {
            PedidoEntity pedidoEntity = mapper.readValue(mensagem, PedidoEntity.class);
            System.out.println("Pedido recebido");
            System.out.println(pedidoEntity.getPedido());
            pedidoEstaPronto.pedidoEstaPronto(pedidoEntity);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
