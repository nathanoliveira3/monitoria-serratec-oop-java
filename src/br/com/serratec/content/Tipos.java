package br.com.serratec.content;

import java.util.ArrayList;
import java.util.List;

public class Tipos {
	public static void main(String[] args) {		

		// TIPOS PRIMITIVOS

		byte b = 125; // -128 a 127 - 1 byte
		short s = 32765; // -32.768 a 32.767 - 2 bytes
		int i = 2_147_483_645; // -2.147.483.648 a 2.147.483.647 - 4 bytes
		long l = 9_223_372_036_854_775_805L; // -9.223.372.036.854.775 a 9.223.372.036.854.775.807 - 8 bytes
		boolean bool = true; // true || false
		char c = 'n'; // 2 bytes
		float f = 34.2548f; // Pode armazenar números de ponto flutuante de precisão simples, até 7 digitos							// - 4 bytes
		double d = 78.7895482457812;// Pode armazenar mais dígitos à direita do ponto de fração decimal - 8bytes

				
		Byte b2 = 125;
		Short s2 = 32765;
		Integer i2 = 2_147_483_645;
		Long l2 = 9_223_372_036_854_775_805l;
		Boolean bool2 = true;
		Character c2 = 'n';
		Float f2 = 34.2548f;
		Double d2 = 78.7895482457812;		
		

		// CAST
		double number = 3.6457;
		int number2 = (int) number;

		System.out.println(number2);

		// PASCAL CASE - usado para nomear classes;
		// EX: ProductService, ProductController, Product;

		// CAMEL CASE - usado para nomear variáveis e métodos/funcões;
		// EX: newProduct, newService, product;

		// Comentário de uma linha

		/*
		 * - Comentário de multiplas linhas -
		 */		
	}
}
