package tech.johann.nelioUdemy;

import java.util.Scanner;

public class Aula29_Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int matricula;
		double horas, valorHora, salario;
		
		System.out.println("Digite a matricula: ");
		matricula = sc.nextInt();
		System.out.println("Digite as horas trabalhadas: ");
		horas = sc.nextDouble();
		System.out.println("Digite o valor da hora trabalhada: ");
		valorHora = sc.nextDouble();
		
		salario = horas * valorHora;
		
		System.out.println("NUMBER = " + matricula);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	}

}
