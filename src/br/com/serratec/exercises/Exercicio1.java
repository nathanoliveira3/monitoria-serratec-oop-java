package br.com.serratec.exercises;

import java.util.Scanner;

public class Exercicio1 {
	/*
	 * 1 - Fa�a um programa para ler dois valores inteiros, e depois mostrar no
	 * console a soma desses n�meros.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira um n�mero inteiro: ");
		Integer numero1 = scan.nextInt();
		
		System.out.println("Insira outro n�mero inteiro: ");
		Integer numero2  = scan.nextInt();		
		
		Integer soma = numero1 + numero2;
		System.out.println("A soma dos dois n�meros � : " + soma);		
		
		scan.close();
	}
}
