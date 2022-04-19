package br.com.serratec.heranca;

import java.time.LocalDate;

public abstract class Mamifero extends Animal {
	private String raca;

	public Mamifero(String nome, LocalDate dataVacinacao, String raca) {
		super(nome, dataVacinacao);
		this.raca = raca;
	}
	
	public abstract void amamentar();

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public String toString() {
		return super.toString() + "raca=" + raca + ", ";
	}
	
}
