package tech.johann.nelioUdemy;

import java.util.Scanner;

public class Aula36_If_Else_Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("DIGITE UM NUMERO");	
		num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("NEGATIVO");			
		}else {
			System.out.println("NÃO NEGATIVO");		
		}		
		
		sc.close();

	}

}
