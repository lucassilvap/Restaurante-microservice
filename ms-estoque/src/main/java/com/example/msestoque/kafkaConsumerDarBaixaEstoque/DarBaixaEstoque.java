package com.example.msestoque.kafkaConsumerDarBaixaEstoque;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class DarBaixaEstoque {


    @KafkaListener(topics = "dar-baixa-estoque", groupId = "group_id")
    public void darBaixaEstoque(String mensagem){

    }

}
