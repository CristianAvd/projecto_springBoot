package com.bolsadeideas.springboot.backend.apirest.controllers;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Categoria;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Cliente;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Compra;
import com.bolsadeideas.springboot.backend.apirest.models.services.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api")
public class CategoriaController {

    @Autowired
    private ICategoriaService categoriaService;


    @Secured({"ROLE_ADMIN"})
    @GetMapping
    public ResponseEntity<List<Categoria>> findAllCategorias() {
        return new ResponseEntity<List<Categoria>>(categoriaService.findCategorias(), HttpStatus.OK);
    }

    @Secured({"ROLE_ADMIN"})
    @GetMapping("/categorias/{id}")
    public Categoria show(@PathVariable Long id) {
        return this.categoriaService.findById(id);
    }

    @Secured({"ROLE_ADMIN", "ROLE_USER"})
    @PostMapping("/crear")
    public ResponseEntity<?> crearCategoria(@RequestBody Categoria categoria){
        return new ResponseEntity<>(categoriaService.save(categoria), HttpStatus.CREATED);
    }

    @Secured({"ROLE_ADMIN"})
    @PutMapping("/categorias/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Categoria update(@RequestBody Categoria categoria, @PathVariable Long id) {
        Categoria currentCategoria = this.categoriaService.findById(id);
        currentCategoria.setNombre(categoria.getNombre());
        this.categoriaService.save(currentCategoria);
        return currentCategoria;
    }

    @Secured({"ROLE_ADMIN"})
    @DeleteMapping("/categorias/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        Categoria currentCategoria = this.categoriaService.findById(id);
        this.categoriaService.delete(currentCategoria.getId());
    }






}
