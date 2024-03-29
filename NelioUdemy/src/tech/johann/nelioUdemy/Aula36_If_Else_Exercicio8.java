package tech.johann.nelioUdemy;

import java.util.Locale;
import java.util.Scanner;

public class Aula36_If_Else_Exercicio8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double salario, imposto;
		
		System.out.println("INFORME SEU SALARIO");
		salario = sc.nextDouble();
		
		if (salario <= 2000.0) {
			imposto = 0.0;
		}else if(salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
			System.out.printf("IMPOSTO R$: %.2f%n",imposto);
		}else if(salario <=4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
			System.out.printf("IMPOSTO R$: %.2f%n",imposto);
		}else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
			System.out.printf("IMPOSTO R$: %.2f%n",imposto);
		}
		
		if (imposto == 0.0) {
			imposto = 0.0;
			System.out.printf("IMPOSTO A PAGAR R$: %.2f%n",imposto);
			System.out.println("ISENTO DE IMPOSTO DE RENDA");
		}else {
			System.out.printf("O VALOR A PAGAR DE IMPOSTO É R$: %.2f%n",imposto);
		}
		sc.close();

	}

}
