package com.campuzano.app.productos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.campuzano.springboot.app.commons.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long> {

}
