package com.campuzano.app.productos.models.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.campuzano.app.productos.models.entity.Producto;
import com.campuzano.app.productos.models.service.IProductoService;

@RestController
public class ProductoController {
		
		@Autowired
		private Environment environment;
	
		@Autowired
		private IProductoService productoService;
		
		@GetMapping("/listar")
		public List<Producto> listar() {
			return productoService.findAll().stream().map(producto -> {
				producto.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
				return producto;
			}).collect(Collectors.toList());
		}
		
		@GetMapping("/ver/{id}")
		public Producto detalle(@PathVariable Long id) throws Exception {
			Producto producto = productoService.findById(id);
			producto.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
			
//			boolean ok = false;
//			if(ok == false) {
//				throw new Exception("No se pudo cargar el producto");
//			}
			
//			try {
//				Thread.sleep(2000L);
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
			
			return producto;
		}
}
