package br.com.serratec.exercises;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		/*
		 * 3 - Fazer um programa para ler um n�mero inteiro, e depois dizer se este
		 * n�mero � negativo ou n�o.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe um n�mero inteiro: ");
		Integer numero = scan.nextInt();
		
		if(numero < 0) {
			System.out.println("N�mero negativo.");
		}else {
			System.out.println("N�mero positivo.");
		}

		scan.close();		
	}
}
