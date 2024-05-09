package com.example.mscozinha.consumerSeChegouAlgumPedidoParaAcozinha;

import com.example.mscozinha.dto.PedidoDto;
import com.example.mscozinha.entity.PedidoEntity;
import com.example.mscozinha.kafkaProducerSeOPedidoEstaPronto.PedidoEstaPronto;
import com.example.mscozinha.service.CozinhaService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
public class ConsumerPedidoParaAcozinha {

    private ObjectMapper mapper = new ObjectMapper();

    @Autowired
    PedidoEstaPronto pedidoEstaPronto;

    @Autowired
    private CozinhaService cozinhaService;

    @KafkaListener(topics = "pedido-para-a-cozinha", groupId = "group_id")
    public void Consumer(String mensagem){
        try {
            PedidoDto pedidoDto = mapper.readValue(mensagem, PedidoDto.class);
            System.out.println("Pedido recebido");
            System.out.println(pedidoDto.getPedido());
            cozinhaService.salvarPedido(new PedidoEntity(pedidoDto.getPedido(), LocalDateTime.now()));
            pedidoEstaPronto.pedidoEstaPronto(pedidoDto);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
