package br.com.serratec.exercises;

import java.util.Scanner;

public class Exercicio5 {
	/*
	 * 5 - Escreva um programa que repita a leitura de uma senha at� que 
	 * ela seja v�lida. Para cada leitura de senha incorreta informada, 
	 * escrever a mensagem "Senha Invalida". Quando a senha for informada 
	 * corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. 
	 * Considere que a senha correta � o valor 2002.
	 */		
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String senha = "";
		
		System.out.println("Informe a senha:");
		senha =scan.nextLine();
		
		while(!senha.equalsIgnoreCase("2002")) {
			System.out.println("Senha inv�lida! Tente novamente.");
			senha = scan.nextLine();
		}
		
		System.out.println("Acesso permitido!");
		scan.close();			
	}
}
