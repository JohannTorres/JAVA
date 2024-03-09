package tech.johann.beeJava;

import java.util.Locale;
import java.util.Scanner;

public class Desafio1010 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int codPeca1, codPeca2, quantPeca1, quantPeca2;
		
		double valorPeca1, valorPeca2, total;
		
		codPeca1 = sc.nextInt();
		quantPeca1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();
		
		codPeca2 = sc.nextInt();
		quantPeca2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();
		
		total = (quantPeca1 * valorPeca1) + (quantPeca2 * valorPeca2); 
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n",total);
		
		sc.close();
	}

}
