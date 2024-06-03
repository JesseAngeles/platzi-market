package com.platzi.market.persistance.crud;

import com.platzi.market.persistance.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    // Misma funcionalidad, se define el query o se define mediante la funcion
    @Query(value = "SELECT * FROM productos WHERE id_categoria = ? ORDER BY nombre ASC", nativeQuery = true)
    List<Producto> getByCategoria(int idCategoria);

    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
