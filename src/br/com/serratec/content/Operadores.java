package br.com.serratec.content;

public class Operadores {

	// = - Operador de atribui��o

	// OPERADORES ARITM�TICOS
	// + SOMA
	// - SUBTRA��O
	// * MULTIPLICA��O
	// / DIVIS�O
	// % RESTO DE DIVIS�O

	// ++ INCREMENTO
	// -- DECREMENTO

	// == IGUALDADE
	// != DIFERENTE

	// > MAIOR QUE
	// >= MAIOR OU IGUAL
	// < MENOR QUE
	// <= MENOR OU IGUAL

	// OPERADORES L�GICOS
	// && E
	// || OU

	public static void main(String[] args) {
		int numero1 = 13;
		int numero2 = 10;

		System.out.println(numero1 + numero2);
		System.out.println(numero1 - numero2);
		System.out.println(numero1 * numero2);
		System.out.println(numero1 / numero2);
		System.out.println(numero1 % numero2);

		System.out.println(numero1++);
		System.out.println(numero2--);

		System.out.println(numero1 == numero2);
		System.out.println(numero1 != numero2);

		System.out.println(numero1 > numero2);
		System.out.println(numero1 >= numero2);
		System.out.println(numero1 < numero2);
		System.out.println(numero1 <= numero2);

		// IF - ELSE
		if (numero1 == 10 && numero2 == 10) {
			System.out.println("S�o iguais!");
		} else {
			System.out.println("S�o diferentes!");
		}

		if (numero1 == 10 || numero2 == 10) {
			System.out.println("S�o iguais!");
		} else {
			System.out.println("S�o diferentes!");
		}

		// WHILE
		int cont = 0;
		while (cont <= 10) {
			System.out.println(cont);
			cont++;
		}

		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}

		// DO WHILE
		int cont2 = 0;
		do {
			System.out.println(cont);
			cont2++;
		} while (cont2 <= 10);

		String nome = "Nathan";
		if (nome.equalsIgnoreCase("Nathan")) {

		}	
	}
}
