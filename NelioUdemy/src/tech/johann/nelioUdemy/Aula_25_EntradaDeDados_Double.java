package tech.johann.nelioUdemy;

import java.util.Locale;
import java.util.Scanner;

public class Aula_25_EntradaDeDados_Double {

	public static void main(String[] args) {
				//esse codigo serve para ler um numero com ponto flutuante a partir do teclado
		
				//a depender do idioma do computador existe a diferenca quando se digita
				// o ponto ou a virgula, para corrigir isso usa-se location
				Locale.setDefault(Locale.US);
		
				//inicia a variavel com a entrada de dados padrao do teclado
				Scanner sc = new Scanner(System.in);
				
				//Double x;
				double x;
				
				// x recebe o valor digitado do tipo double
				x = sc.nextDouble();
				
				//exibe na tela o que o usuário digitou e que foi atribuido a x
				System.out.println("Você digitou: " + x);
				
				//essa funcao vai desalocar o scanner criado
				sc.close();
	}

}
