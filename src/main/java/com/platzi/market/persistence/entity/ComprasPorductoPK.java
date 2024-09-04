package com.platzi.market.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class ComprasPorductoPK implements Serializable {

    @Column(name = "id_compra")
    private String idCompra;

    @Column(name = "id_producto")
    private String idProducto;

}
