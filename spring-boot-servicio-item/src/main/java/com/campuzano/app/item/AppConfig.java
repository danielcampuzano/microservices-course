package com.campuzano.app.item;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
	
	@LoadBalanced
	@Bean("clienteRest")
	public RestTemplate registrarRestTemplate() {
		//El objeto que se retorna se guarda en el contenedor de Spring
		return new RestTemplate();
	}
	
}
