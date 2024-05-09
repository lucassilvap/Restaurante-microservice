package com.example.mscozinha.kafkaProducerSeOPedidoEstaPronto;

import com.example.mscozinha.entity.PedidoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import javax.swing.text.html.parser.Entity;

@Service
public class PedidoEstaPronto {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String topic = "pedido-esta-pronto";

    public void pedidoEstaPronto(PedidoEntity pedidoEntity){
         kafkaTemplate.send(topic, "pedido está pronto");
    }
}
