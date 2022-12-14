package com.bolsadeideas.springboot.backend.apirest.models.services;

import com.bolsadeideas.springboot.backend.apirest.models.dao.ICategoriaDao;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements ICategoriaService{

    @Autowired
    private ICategoriaDao categoriaDao;

    @Override
    public List<Categoria> findCategorias() {
        return (List<Categoria>) categoriaDao.findAll();
    }

    @Override
    public Categoria findById(Long id) {
        return categoriaDao.findById(id).orElse(null);
    }

    @Override
    public Categoria save(Categoria categoria) {
        return categoriaDao.save(categoria);
    }

    @Override
    public void delete(Long id) {
        categoriaDao.deleteById(id);
    }
}
