package br.com.serratec.exercises;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		/*
		 * Leia um valor inteiro X (1 <= X <= 1000). 
		 * Em seguida mostre os ímpares de 1 até X, um valor por linha, 
		 * inclusive o X, se for o caso.
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro entre 1 e 1000: ");
		Integer numero = scan.nextInt();
		
		for(int i = 1; i <= numero; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}		
		scan.close();
	}
}
