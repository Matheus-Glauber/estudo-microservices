package br.com.folhadepagamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class FolhaDePagamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FolhaDePagamentoApplication.class, args);
	}

}
