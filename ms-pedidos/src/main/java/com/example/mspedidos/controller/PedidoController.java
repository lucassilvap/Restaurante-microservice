package com.example.mspedidos.controller;

import com.example.mspedidos.entity.PedidoEntity;
import com.example.mspedidos.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;


    @PostMapping
    public ResponseEntity<?> salvarPedido(@RequestBody PedidoEntity pedidoEntity){
        pedidoService.EnviarPedidoParaACozinha(pedidoEntity);
        return ResponseEntity.ok("pedido realizado com sucesso");
    }
}
