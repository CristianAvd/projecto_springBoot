package com.bolsadeideas.springboot.backend.apirest.models.services;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Categoria;

import java.util.List;

public interface ICategoriaService {

    public List<Categoria> findCategorias();
}
