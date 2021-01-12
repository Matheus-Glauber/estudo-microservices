package br.com.folhadepagamento.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.folhadepagamento.entities.Pagamento;
import br.com.folhadepagamento.entities.Trabalhador;
import br.com.folhadepagamento.feignclients.TrabalhadorFeignClients;

@Service
public class PagamentoService {
	
	private static final String GETTRABALHADORID= "/trabalhadores/{id}";
	
	@Autowired
	private TrabalhadorFeignClients trabalhadorFeignClients;
	
	public Pagamento getPagamento(Long trabalhadorId, Integer diasTrabalhados) {
		
		
		Trabalhador trabalhador = trabalhadorFeignClients.buscarTrabalhadorPorId(trabalhadorId).getBody();
				
		return new Pagamento(trabalhador.getNome(), trabalhador.getDiaria(), diasTrabalhados);
	}

}
