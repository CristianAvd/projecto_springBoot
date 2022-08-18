package com.bolsadeideas.springboot.backend.apirest.models.services;


import com.bolsadeideas.springboot.backend.apirest.models.entity.Compra;

public interface CompraService {

    public Compra crearCompra(Compra compra);

    public Compra findById(Long id);


}
