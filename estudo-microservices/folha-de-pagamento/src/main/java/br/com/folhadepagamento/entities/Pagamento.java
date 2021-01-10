package br.com.folhadepagamento.entities;

import java.io.Serializable;

public class Pagamento implements Serializable {

	private static final long serialVersionUID = -1214783305667286033L;

	private String nome;
	private Double diaria;
	private Integer dias;

	public Pagamento() {
	}

	public Pagamento(String nome, Double diaria, Integer dias) {
		this.nome = nome;
		this.diaria = diaria;
		this.dias = dias;
	}

	public Double getTotal() {
		return this.dias * this.diaria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getDiaria() {
		return diaria;
	}

	public void setDiaria(Double diaria) {
		this.diaria = diaria;
	}

	public Integer getDias() {
		return dias;
	}

	public void setDias(Integer dias) {
		this.dias = dias;
	}
}
