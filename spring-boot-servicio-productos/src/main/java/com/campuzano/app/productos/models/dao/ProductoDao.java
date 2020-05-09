package com.campuzano.app.productos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.campuzano.app.productos.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long> {

}
