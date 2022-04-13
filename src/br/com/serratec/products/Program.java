package br.com.serratec.products;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler os dados de um produto em estoque (nome, preço e
		 * quantidade no estoque). Em seguida: Mostrar os dados do produto (nome, preço,
		 * quantidade no estoque, valor total no estoque) Realizar uma entrada no
		 * estoque e mostrar novamente os dados do produto Realizar uma saída no estoque
		 * e mostrar novamente os dados do produto
		 */
		
		Scanner scan = new Scanner(System.in);
		
		Produto produto = new Produto("Iphone", 3500.90, 20);
		produto.setUsado(true);
		
		Produto produto2 =  new Produto();
		produto2.setNome("Notebook");
		System.out.println(produto2);
		
		int opcao = 0;
		while(opcao != 3) {
			System.out.println(produto);
			System.out.println("1 - RETIRAR PRODUTO, 2 - ADICIONAR PRODUTO, 3 - SAIR");
			opcao = scan.nextInt();
			
			switch (opcao) {
			case 1:{
				System.out.println("Informe a quantidade a retirar.");
				Integer retirar = scan.nextInt();
				produto.retirarProduto(retirar);
				break;
			}
			case 2: {
				System.out.println("Informe a quantidade para adicionar.");
				Integer adicionar = scan.nextInt();
				produto.adicionarProduto(adicionar);
				break;
			}
			case 3: {
				System.out.println("Obrigado por utilizar o nosso sistema!");
				break;
			}
			}
			
		}
		scan.close();		
	}
}
