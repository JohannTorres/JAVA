package tech.johann.beeJava;

import java.util.Locale;
import java.util.Scanner;

public class Desafio1002 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double n = 3.14159;
		double raio;
		double calculo;
		
		raio = sc.nextDouble();
		
		calculo = raio * raio * n;
		
		System.out.printf("A=%.4f%n",calculo);
		sc.close();

	}

}
