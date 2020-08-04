package com.campuzano.app.item.models.service;

import java.util.List;

import com.campuzano.app.item.models.Item;
import com.campuzano.app.item.models.Producto;

public interface IItemService {
	
	List<Item> findAll();
	Item findById(Long id, Integer cantidad);
	
	Producto save(Producto producto);
	
	Producto update(Producto producto, Long id);
	
	void delete(Long id);
}
