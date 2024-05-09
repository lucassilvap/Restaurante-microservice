package com.example.mscozinha.kafkaProducerSeOPedidoEstaPronto;

import com.example.mscozinha.dto.PedidoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import javax.swing.text.html.parser.Entity;

@Service
public class PedidoEstaPronto {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String topic = "pedido-esta-pronto";

    public void pedidoEstaPronto(PedidoDto pedidoDto){
         kafkaTemplate.send(topic, "Tudo ok Pedido está pronto!!");
    }
}
