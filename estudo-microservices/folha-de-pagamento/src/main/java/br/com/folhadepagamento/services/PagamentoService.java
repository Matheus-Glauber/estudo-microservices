package br.com.folhadepagamento.services;

import org.springframework.stereotype.Service;

import br.com.folhadepagamento.entities.Pagamento;

@Service
public class PagamentoService {
	
	public Pagamento getPagamento(Long trabalhadorId, Integer diasTrabalhados) {
		return new Pagamento("Matheus Glauber", 180.0, diasTrabalhados);
	}

}
