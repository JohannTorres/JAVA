package tech.johann.AulasAngelo;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String nome;
		
		System.out.println("ESCREVA SEU NOME: ");
		nome = sc.next();
		
		System.out.println(nome);
		
		sc.close();

	}


}
