package com.campuzano.springboot.app.oauth.services;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.campuzano.springboot.app.usuarios.commons.models.entity.Usuario;

public interface IUsuarioService {

	Usuario findByUsername(String username);
	
	public Usuario update(Usuario usuario, Long id);
}
