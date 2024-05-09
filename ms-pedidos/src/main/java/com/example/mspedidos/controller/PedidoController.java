package com.example.mspedidos.controller;

import com.example.mspedidos.dto.PedidoDto;
import com.example.mspedidos.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public ResponseEntity<?> salvarPedido(@RequestBody PedidoDto pedidoDto){
        pedidoService.EnviarPedidoParaACozinha(pedidoDto);
        return ResponseEntity.ok("pedido realizado com sucesso");
    }
}
