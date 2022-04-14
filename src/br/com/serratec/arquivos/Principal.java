package br.com.serratec.arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {
	public static void main(String[] args) throws IOException{
		BufferedReader reader =  new BufferedReader(new FileReader("arquivo.txt"));
		String linha = "";
		String nome;
		Integer idade;
		while(true) {		
			linha = reader.readLine();
			if(linha != null) {				
				String[] param = linha.split(";");
				nome = param[0];
				idade = Integer.parseInt(param[1]);
				System.out.println(nome);
				System.out.println(idade);
				for(int i = 0; i < param.length; i++) {
					System.out.println(param[i]);
				}
			}else {
				break;
			}			
		}
		reader.close();
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("arquivo2.txt"));		
		
		writer.append("Amanhã é feriado!!!");		
		
		writer.close();		
	}
}
