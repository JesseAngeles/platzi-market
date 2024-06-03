package com.platzi.market.persistance.crud;

import com.platzi.market.persistance.entity.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaCrudRepository extends CrudRepository<Categoria, Integer> {
}
