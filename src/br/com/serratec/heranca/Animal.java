package br.com.serratec.heranca;

import java.time.LocalDate;

public abstract class Animal {
	private String nome;
	private LocalDate dataVacinacao;
	
	public Animal(String nome, LocalDate dataVacinacao) {
		super();
		this.nome = nome;
		this.dataVacinacao = dataVacinacao;
	}
	
	public abstract String emitirSom();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataVacinacao() {
		return dataVacinacao;
	}

	public void setDataVacinacao(LocalDate dataVacinacao) {
		this.dataVacinacao = dataVacinacao;
	}

	@Override
	public String toString() {
		return "nome=" + nome + ", dataVacinacao=" + dataVacinacao + ", ";
	}
	
}
