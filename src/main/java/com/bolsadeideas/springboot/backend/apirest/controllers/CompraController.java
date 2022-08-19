package com.bolsadeideas.springboot.backend.apirest.controllers;



import com.bolsadeideas.springboot.backend.apirest.models.entity.Compra;
import com.bolsadeideas.springboot.backend.apirest.models.services.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api1")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @Secured({"ROLE_ADMIN"})
    @GetMapping("/listar")
    public List<Compra> index() {
        return compraService.findAll();
    }

    @Secured({"ROLE_ADMIN"})
    @GetMapping("/compras/{id}")
    public Compra show(@PathVariable Long id) {
        return this.compraService.findById(id);
    }

    @Secured({"ROLE_ADMIN", "ROLE_USER"})
    @PostMapping("/crear")
    public ResponseEntity<?> crearCompra(@RequestBody Compra compra){
       return new ResponseEntity<>(compraService.crearCompra(compra), HttpStatus.CREATED);
    }

    @Secured({"ROLE_ADMIN"})
    @PutMapping("/compras/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Compra update(@RequestBody Compra compra, @PathVariable Long id) {
        Compra currentCompra = this.compraService.findById(id);
        currentCompra.setCreateAt(new Date());
        this.compraService.crearCompra(currentCompra);
        return currentCompra;
    }

    @Secured({"ROLE_ADMIN"})
    @DeleteMapping("/compras/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        Compra currentCompra = this.compraService.findById(id);
        this.compraService.delete(currentCompra.getId());
    }






}
