package tech.johann.nelioUdemy;

import java.util.Scanner;

public class Aula29_Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, diferenca;
		
		System.out.println("DIGITE O VALOR DE A");
		A = sc.nextInt();
		System.out.println("DIGITE O VALOR DE B");
		B = sc.nextInt();
		System.out.println("DIGITE O VALOR DE C");
		C = sc.nextInt();
		System.out.println("DIGITE O VALOR DE D");
		D = sc.nextInt();
		
		diferenca = (A*B-C*D);
		
		System.out.println("DIFERENÇA= "+diferenca);
		
		sc.close();

	}

}
