package com.bolsadeideas.springboot.backend.apirest.models.dao;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Compra;
import org.springframework.data.repository.CrudRepository;

public interface CompraRepo extends CrudRepository<Compra, Long> {
}
