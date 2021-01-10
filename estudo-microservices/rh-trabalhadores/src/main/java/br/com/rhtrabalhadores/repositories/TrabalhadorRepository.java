package br.com.rhtrabalhadores.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rhtrabalhadores.entities.Trabalhador;

public interface TrabalhadorRepository extends JpaRepository<Trabalhador, Long> {

}
