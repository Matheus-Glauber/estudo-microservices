package br.com.folhadepagamento.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.folhadepagamento.entities.Pagamento;
import br.com.folhadepagamento.entities.Trabalhador;

@Service
public class PagamentoService {
	
	private static final String GETTRABALHADORID= "/trabalhadores/{id}";
	
	@Value("${rh-trabalhadores.host}")
	private String trabalhadorHost;
	
	@Autowired
	RestTemplate restTemplate;
	
	public Pagamento getPagamento(Long trabalhadorId, Integer diasTrabalhados) {
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("id", trabalhadorId.toString());
		
		Trabalhador trabalhador = restTemplate.getForObject(trabalhadorHost + GETTRABALHADORID, Trabalhador.class, uriVariables);
		
		return new Pagamento(trabalhador.getNome(), trabalhador.getDiaria(), diasTrabalhados);
	}

}
