package com.bolsadeideas.springboot.backend.apirest.models.services;



import com.bolsadeideas.springboot.backend.apirest.models.entity.Compra;

import java.util.List;

public interface CompraService {

    public Compra crearCompra(Compra compra);

    public Compra findById(Long id);

    public List<Compra> findAll();

    public void delete(Long id);




}
