package br.com.serratec.exercises;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		/*
		 * 4 - Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par
		 * ou �mpar.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe um n�mero inteiro: ");
		Integer numero = scan.nextInt();
		
		if(numero % 2 != 0) {
			System.out.println("O n�mero � �mpar.");
		}else {
			System.out.println("O n�mero � par.");
		}

		scan.close();
	}
}
