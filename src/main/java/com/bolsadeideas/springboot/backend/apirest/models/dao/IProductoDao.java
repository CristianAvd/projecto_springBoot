package com.bolsadeideas.springboot.backend.apirest.models.dao;

import java.util.List;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Categoria;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long>{


	//SELECCIONAR TODAS LAS CATEGORÍAS
	@Query("FROM Categoria")
	public List<Categoria> findCategorias();

	//SELECCIONAR TODOS LOS PRODUCTOS CON EL ID_CATEGORÍA QUE VENGA DE PARÁMETRO(LONG id)
	@Query("FROM Producto p WHERE p.categoria.id = ?1")
	public List<Producto> getProductosPorCate(Long id);

	@Query("select p from Producto p where p.nombre like %?1%")
	public List<Producto> findByNombre(String term);
	
	public List<Producto> findByNombreContainingIgnoreCase(String term);
	
	public List<Producto> findByNombreStartingWithIgnoreCase(String term);
}
