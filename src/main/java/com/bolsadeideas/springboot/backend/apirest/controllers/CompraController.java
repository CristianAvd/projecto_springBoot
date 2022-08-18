package com.bolsadeideas.springboot.backend.apirest.controllers;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Compra;
import com.bolsadeideas.springboot.backend.apirest.models.services.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/compras")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @PostMapping("/crear")
    public ResponseEntity<?> crearCompra(@RequestBody Compra compra){
       return new ResponseEntity<>(compraService.crearCompra(compra), HttpStatus.CREATED);
    }


}
