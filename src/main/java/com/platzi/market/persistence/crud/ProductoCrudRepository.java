package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    //Esta es la primera opcion donde a partir de la sintaxis que nos ofrece queryMethods de Spring Data JPA realizamos la busqueda
    //en el siguiente ejemplo le decimos nos entregue todos los productos que pertenecen a una categoria
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);


    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

    //Otra posible opcion de realizarlo seria la siguiente
    /*@Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)
    List<Producto> encontrarPorCategoria(int idCategoria);*/
}
