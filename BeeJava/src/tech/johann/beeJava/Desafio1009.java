package tech.johann.beeJava;

import java.util.Locale;
import java.util.Scanner;

public class Desafio1009 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc =  new Scanner(System.in);
		
		String nome;
		
		double salario, vendas, salarioTotal;
		
		nome = sc.next();
		
		salario = sc.nextDouble();
		
		vendas = sc.nextDouble();
		
		salarioTotal = salario + (vendas * 0.15);
		
		System.out.printf("TOTAL = R$ %.2f%n",salarioTotal);	
		
		sc.close();
	}

}
