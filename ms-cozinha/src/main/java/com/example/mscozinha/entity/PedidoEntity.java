package com.example.mscozinha.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class PedidoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public PedidoEntity(String pedido, LocalDateTime now) {
        this.pedido = pedido;
        this.localDateTime = now;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private String pedido;

    private LocalDateTime localDateTime;

    public String getPedido() {
        return pedido;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public PedidoEntity() {}
}
