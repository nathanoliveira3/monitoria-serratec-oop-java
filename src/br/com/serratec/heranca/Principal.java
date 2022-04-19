package br.com.serratec.heranca;

import java.time.LocalDate;

public class Principal {
	public static void main(String[] args) {
		Animal tucano = new Tucano("Tucano",LocalDate.now(),"Preto", 0.5 );	
		System.out.println(tucano);
		
		Animal cavalo = new Cavalo("Cavalo", LocalDate.now(), "Pangaré", "Ferradura");
		System.out.println(cavalo);
		
		Animal cachorro = new Cachorro("Doralice", LocalDate.now(), "Vira-Lata", true);
		System.out.println(cachorro);
	}
}
