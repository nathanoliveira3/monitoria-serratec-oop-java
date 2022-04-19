package br.com.serratec.heranca;

import java.time.LocalDate;

public class Cachorro extends Mamifero implements AnimalDomestico{
	private boolean castrado;

	public Cachorro(String nome, LocalDate dataVacinacao, String raca, boolean castrado) {
		super(nome, dataVacinacao, raca);
		this.castrado = castrado;
	}

	public boolean isCastrado() {
		return castrado;
	}

	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}

	@Override
	public void amamentar() {
		System.out.println("Amamentar");
		
	}

	@Override
	public String emitirSom() {		
		return "Som de cachorro";
	}

	@Override
	public boolean levarVeterinario() {		
		return true;
	}

	@Override
	public boolean alimentar() {		
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + "castrado=" + castrado;
	}
	
}
