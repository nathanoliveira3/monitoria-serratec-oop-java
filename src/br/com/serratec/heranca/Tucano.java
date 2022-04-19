package br.com.serratec.heranca;

import java.time.LocalDate;

public class Tucano extends Ave {
	private Double peso;

	public Tucano(String nome, LocalDate dataVacinacao, String cor, Double peso) {
		super(nome, dataVacinacao, cor);
		this.peso = peso;
	}

	@Override
	public String voar() {
		return "voando";
	}

	@Override
	public String emitirSom() {
		return "barulho";
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() +"peso = " + peso;
	}
	
}
