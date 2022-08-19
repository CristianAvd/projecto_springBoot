package com.bolsadeideas.springboot.backend.apirest.models.services;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Categoria;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Cliente;

import java.util.List;

public interface ICategoriaService {

    public List<Categoria> findCategorias();

    public Categoria findById(Long id);

    public Categoria save(Categoria categoria);

    public void delete(Long id);
}
