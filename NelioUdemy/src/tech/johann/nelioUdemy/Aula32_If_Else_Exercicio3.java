package tech.johann.nelioUdemy;

import java.util.Scanner;

public class Aula32_If_Else_Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int A,B;
		
		System.out.println("DIGITE O VALOR DE A");
		A = sc.nextInt();
		System.out.println("DIGITE O VALOR DE B");
		B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("SAO MULTIPLOS");
		}
		else {
			System.out.println("NAO SAO MULTIPLOS");
		}
		sc.close();
	}

}