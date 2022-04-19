package br.com.serratec.heranca;

import java.time.LocalDate;

public class Cavalo extends Mamifero implements AnimalCompeticao {
	private String marcaFerradura;

	public Cavalo(String nome, LocalDate dataVacinacao, String raca, String marcaFerradura) {
		super(nome, dataVacinacao, raca);
		this.marcaFerradura = marcaFerradura;
	}

	@Override
	public void amamentar() {
		System.out.println("Amamentar");		
	}

	@Override
	public String emitirSom() {
		return "Som de cavalo";
	}

	public String getMarcaFerradura() {
		return marcaFerradura;
	}

	public void setMarcaFerradura(String marcaFerradura) {
		this.marcaFerradura = marcaFerradura;
	}

	@Override
	public void trocarFerradura() {
		System.out.println("Trocando ferradura");
		
	}

	@Override
	public void viajar() {
		System.out.println("Cavalo viajando");
		
	}

	@Override
	public String toString() {
		return super.toString() + "marcaFerradura=" + marcaFerradura;
	}
	
}
