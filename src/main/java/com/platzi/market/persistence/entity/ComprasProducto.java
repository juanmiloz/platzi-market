package com.platzi.market.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "compras_productos")
@Data
public class ComprasProducto {

    @EmbeddedId
    private ComprasPorductoPK id;

    private String cantidad;

    private Double total;

    private Boolean estado;

    @ManyToOne()
    @JoinColumn(name = "id_compra", insertable = false, updatable = false)
    private Compra compra;

    @ManyToOne()
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Producto producto;
}
