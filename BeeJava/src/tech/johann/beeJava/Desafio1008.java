package tech.johann.beeJava;

import java.util.Locale;

import java.util.Scanner;

public class Desafio1008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);
		
		int entrada_funcionario = input.nextInt();
		int entrada_horasTrabalhadas = input.nextInt();
		double entrada_valorHoras = input.nextDouble();
		
		double salario = entrada_horasTrabalhadas * entrada_valorHoras;
		
		System.out.println("NUMBER = "+entrada_funcionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		input.close();

	}

}
