package com.platzi.market.persistence.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "productos")
@Data
public class Producto {

    @Id // Indica que es la llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Indica que es autoincrementable
    @Column(name = "id_producto") // Indica el nombre de la columna en la base de datos
    private Integer idProducto;

    private String nombre;

    @Column(name = "id_categoria")
    private String codigoBarras;

    @Column(name = "precio_venta")
    private Double precioVenta;

    @Column(name = "cantidad_stock")
    private Integer cantidadStock;

    @Column(name = "estado")
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false) // Indica que no se va a insertar ni actualizar
    private Categoria categoria;

}
