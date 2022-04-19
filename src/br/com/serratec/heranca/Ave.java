package br.com.serratec.heranca;

import java.time.LocalDate;

public abstract class Ave extends Animal {
	private String cor;

	public Ave(String nome, LocalDate dataVacinacao, String cor) {
		super(nome, dataVacinacao);
		this.cor = cor;
	}
	
	public abstract String voar();

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return super.toString() + "cor=" + cor + ", ";
	}	
}
