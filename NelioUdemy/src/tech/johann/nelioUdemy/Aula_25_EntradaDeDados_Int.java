package tech.johann.nelioUdemy;

import java.util.Scanner;

public class Aula_25_EntradaDeDados_Int {

	public static void main(String[] args) {
				//esse codigo serve para ler um numero inteiro a partir do teclado
		
				//inicia a variavel com a entrada de dados padrao do teclado
				Scanner sc = new Scanner(System.in);
				
				int x;
				
				//recebe o numero digitado no teclado pelo usuário
				
				x = sc.nextInt();
				
				//exibe na tela o que o usuário digitou e que foi atribuido a x
				System.out.println("Você digitou: " + x);
				
				//essa funcao vai desalocar o scanner criado
				sc.close();

	}

}
