package br.com.folhadepagamento.entities;

import java.io.Serializable;

public class Trabalhador implements Serializable {

	private static final long serialVersionUID = 5376271109790833993L;
	
	private Long id;

	private String nome;

	private Double diaria;

	public Trabalhador() {
	}

	public Trabalhador(Long id, String nome, Double diaria) {
		this.id = id;
		this.nome = nome;
		this.diaria = diaria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trabalhador other = (Trabalhador) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
