package tech.johann.nelioUdemy;

import java.util.Scanner;

public class Aula_25_EntradaDeDados_String {

	public static void main(String[] args) {
		//esse codigo serve para ler uma palavra a partir do teclado
		
		//inicia a variavel com a entrada de dados padrao do teclado
		Scanner sc = new Scanner(System.in);
		
		//String x;
		int x;
		
		//recebe o valor digitado no teclado pelo usuário
		//x = sc.next();
		
		x = sc.nextInt();
		
		//exibe na tela o que o usuário digitou e que foi atribuido a x
		System.out.println("Você digitou: " + x);
		
		//essa funcao vai desalocar o scanner criado
		sc.close();
		

	}

}
