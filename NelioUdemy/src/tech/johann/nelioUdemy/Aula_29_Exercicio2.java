package tech.johann.nelioUdemy;

import java.util.Scanner;

public class Aula_29_Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double entrada1, A, pi=3.14159;
		
		System.out.println("digite um valor: ");
		
		entrada1 = sc.nextDouble();
		
		System.out.println("você digitou: "+entrada1);
		
		A = pi * entrada1 * entrada1;
		
		System.out.printf("o valor digitado foi: %.2f%n e o resultado do raio é: %.4f%n", entrada1,A);
		
		sc.close();
		

	}

}