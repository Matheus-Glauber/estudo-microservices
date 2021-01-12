package br.com.folhadepagamento.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.folhadepagamento.entities.Trabalhador;

@Component
@FeignClient(
		name = "rh-trabalhadores",
		url = "localhost:8095",
		path = "/trabalhadores")
public interface TrabalhadorFeignClients {
	
	@GetMapping(value = "/{id}")
	ResponseEntity<Trabalhador> buscarTrabalhadorPorId(@PathVariable Long id);

}
