package br.com.serratec.exercises;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		/*
		 * 3 - Fazer um programa para ler um número inteiro, e depois dizer se este
		 * número é negativo ou não.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe um número inteiro: ");
		Integer numero = scan.nextInt();
		
		if(numero < 0) {
			System.out.println("Número negativo.");
		}else {
			System.out.println("Número positivo.");
		}

		scan.close();		
	}
}
