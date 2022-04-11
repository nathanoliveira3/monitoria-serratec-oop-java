package br.com.serratec.exercises;

import java.util.Scanner;

public class Exercicio2 {
	/*
	 * 2- Faça um programa para ler o valor do raio de um círculo, e depois mostrar
	 * o valor da área deste círculo com quatro casas decimais. Fórmula da área:
	 * area = π . raio². Considere o valor de π = 3.14159.
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o raio do círculo: ");
		Double raio = scan.nextDouble();
		
		Double pi = 3.14159;		
		Double area = pi * Math.pow(raio, 2);
		
		System.out.println("A área do círculo é de " + area);
		
		scan.close();
	}
}
