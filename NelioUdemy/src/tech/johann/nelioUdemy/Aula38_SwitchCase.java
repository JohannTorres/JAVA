package tech.johann.nelioUdemy;

import java.util.Scanner;

public class Aula38_SwitchCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String dia;
		int codigo; 
		
		System.out.println("INSIRA UM NUMERO DE 1 A 7");
		
		codigo = sc.nextInt();
		
		
		switch (codigo) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "valor invalido!";		
		}
		System.out.printf("O NUMERO %d EQUIVALE A: %s",codigo,dia);
		sc.close();
	}

}
