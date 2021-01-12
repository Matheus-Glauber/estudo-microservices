package br.com.folhadepagamento.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
/**
 * Classe de configurações
 * 
 * @author MatheusGlauber
 */
@Configuration
public class AppConfig {
	
	/**
	 * Implementação do padrão de projeto Singleton, para ter a disposição um objeto RestTemplate para injetar em outros serviços
	 * 
	 * @return RestTemplate
	 */
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
