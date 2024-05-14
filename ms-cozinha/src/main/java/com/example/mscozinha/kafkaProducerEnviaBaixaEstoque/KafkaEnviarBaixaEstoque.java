package com.example.mscozinha.kafkaProducerEnviaBaixaEstoque;

import com.example.mscozinha.dto.PedidoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaEnviarBaixaEstoque {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String topic = "dar-baixa-estoque";

    public void darBaixaEstoque(){
        kafkaTemplate.send(topic, "pão");
    }
}
