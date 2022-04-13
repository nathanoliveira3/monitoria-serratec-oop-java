package br.com.serratec.polimorfismo;

public class Programador extends Pessoa {
	
	@Override
	public void falar() {		
		super.falar();
		System.out.println("Falei outra coisa");
	}
}
