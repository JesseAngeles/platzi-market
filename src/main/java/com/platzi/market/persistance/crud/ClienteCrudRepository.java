package com.platzi.market.persistance.crud;

import com.platzi.market.persistance.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteCrudRepository extends CrudRepository<Cliente, String> {
}
