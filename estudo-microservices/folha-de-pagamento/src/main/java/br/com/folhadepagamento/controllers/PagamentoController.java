package br.com.folhadepagamento.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.folhadepagamento.entities.Pagamento;
import br.com.folhadepagamento.services.PagamentoService;

@RestController
@RequestMapping(value = "/pagamentos")
public class PagamentoController {
	
	@Autowired
	private PagamentoService pagamentoService;
	
	@GetMapping(value = "/{trabalhadorId}/dias/{diasTrabalhados}")
	public ResponseEntity<Pagamento> getPagamento(@PathVariable Long trabalhadorId, @PathVariable Integer diasTrabalhados) {
		Pagamento pagamento = pagamentoService.getPagamento(trabalhadorId, diasTrabalhados);
		
		return ResponseEntity.ok(pagamento);
	}

}
