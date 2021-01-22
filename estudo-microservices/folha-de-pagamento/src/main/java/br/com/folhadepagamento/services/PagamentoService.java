package br.com.folhadepagamento.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.folhadepagamento.entities.Pagamento;
import br.com.folhadepagamento.entities.Trabalhador;
import br.com.folhadepagamento.feignclients.TrabalhadorFeignClients;

@Service
public class PagamentoService {
	
	@Autowired
	private TrabalhadorFeignClients trabalhadorFeignClients;
	
	public Pagamento getPagamento(Long trabalhadorId, Integer diasTrabalhados) {
		
		
		Trabalhador trabalhador = trabalhadorFeignClients.buscarTrabalhadorPorId(trabalhadorId).getBody();
				
		return new Pagamento(trabalhador.getNome(), trabalhador.getDiaria(), diasTrabalhados);
	}

}
