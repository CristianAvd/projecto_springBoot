package com.bolsadeideas.springboot.backend.apirest.models.dao;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface ICategoriaDao  extends CrudRepository<Categoria, Long> {
}
