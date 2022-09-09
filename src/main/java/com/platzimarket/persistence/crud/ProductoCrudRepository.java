package com.platzimarket.persistence.crud;

import com.platzimarket.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository <Producto, Integer>{

    //    Con este Query ya no habria necesidad de nombrar con la nomenclatura de abajo
    //    Con este query buscamos los productos por idCategoria y lo ordenamos alfabeticamente.
    //    @Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)

    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    // Con este query buscamos los productos escasos

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

}
