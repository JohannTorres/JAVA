package tech.johann.beeJava;

import java.util.Locale;
import java.util.Scanner;

public class Desafio1006 {
	
	//metodo main
	public static void main(String[] args) {
		// Converte virgula em ponto a depender da regiao
		Locale.setDefault(Locale.US);
		
		//Scanner leitor = novo leitor
		Scanner input = new Scanner(System.in);
		//variavel a = proximo leitor do tipo double
		double var_a = input.nextDouble();
		//variavel b = proximo leitor do tipo double
		double var_b = input.nextDouble();
		//variavel c = proximo leitor do tipo double
		double var_c = input.nextDouble();

		//calculoa media por peso de cada valor digitado onde o peso da nota 10
		double media = ((var_a*2) + (var_b*3) + (var_c*5)) / 10;
		
		//exibe o calculo da media onde MEDIA = %.1 exibe apenas 1 casa decimal apos virgula
		System.out.println(String.format("MEDIA = %.1f", media));
		
		input.close();
		
	}

}
