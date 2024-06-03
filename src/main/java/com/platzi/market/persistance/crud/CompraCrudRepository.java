package com.platzi.market.persistance.crud;

import com.platzi.market.persistance.entity.Compra;
import org.springframework.data.repository.CrudRepository;

public interface CompraCrudRepository extends CrudRepository<Compra, Integer> {
}
