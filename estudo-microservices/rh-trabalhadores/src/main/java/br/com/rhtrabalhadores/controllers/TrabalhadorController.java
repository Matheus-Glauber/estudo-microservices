package br.com.rhtrabalhadores.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rhtrabalhadores.entities.Trabalhador;
import br.com.rhtrabalhadores.repositories.TrabalhadorRepository;

@RestController
@RequestMapping(value = "/trabalhadores")
public class TrabalhadorController {

	@Autowired
	private TrabalhadorRepository trabalhadorRepository;

	@GetMapping
	public ResponseEntity<List<Trabalhador>> buscarTodos() {
		List<Trabalhador> trabalhadores = trabalhadorRepository.findAll();

		return ResponseEntity.ok(trabalhadores);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Trabalhador> buscarTrabalhadorPorId(@PathVariable Long id) {
		Trabalhador trabalhador = trabalhadorRepository.findById(id).get();

		return ResponseEntity.ok(trabalhador);
	}

}
