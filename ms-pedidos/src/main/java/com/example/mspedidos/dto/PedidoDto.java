package com.example.mspedidos.dto;

public class PedidoDto {

    private String pedido;

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public PedidoDto(String pedido) {
        this.pedido = pedido;
    }

    public PedidoDto() {

    }

}
