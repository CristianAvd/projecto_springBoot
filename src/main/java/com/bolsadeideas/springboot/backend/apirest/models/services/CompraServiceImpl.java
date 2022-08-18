package com.bolsadeideas.springboot.backend.apirest.models.services;

import com.bolsadeideas.springboot.backend.apirest.models.dao.CompraRepo;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Compra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompraServiceImpl implements CompraService{

    @Autowired
    private CompraRepo compraRepo;

    @Override
    public Compra crearCompra(Compra compra) {
        return compraRepo.save(compra);
    }

    @Override
    public Compra findById(Long id) {
        return compraRepo.findById(id).orElse(null);
    }
}
