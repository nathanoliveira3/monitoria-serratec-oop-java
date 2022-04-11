package br.com.serratec.exercises;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		/*
		 * 4 - Fazer um programa para ler um número inteiro e dizer se este número é par
		 * ou ímpar.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe um número inteiro: ");
		Integer numero = scan.nextInt();
		
		if(numero % 2 != 0) {
			System.out.println("O número é ímpar.");
		}else {
			System.out.println("O número é par.");
		}

		scan.close();
	}
}
