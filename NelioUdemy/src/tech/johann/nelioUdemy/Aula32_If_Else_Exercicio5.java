package tech.johann.nelioUdemy;

import java.util.Scanner;

public class Aula32_If_Else_Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codigo, quantidade;
		
		double total;
		
		System.out.println("DIGITE O CODIGO DO ITEM");
		codigo = sc.nextInt();
		System.out.println("DIGITE A QUANTIDADE DO ITEM");
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			total = quantidade * 4.00;
			System.out.printf("VOCE PEDIU "+quantidade+" CACHORRO QUENTE E O TOTAL FOI: %.2f%n",total);
		}else if (codigo == 2) {
			total = quantidade * 4.50;
			System.out.printf("VOCE PEDIU "+quantidade+" X-SALADA E O TOTAL FOI R$: %.2f%n",total);
		}else if (codigo == 3) {
			total = quantidade * 5.00;
			System.out.printf("VOCE PEDIU "+quantidade+" X-BACON E O TOTAL FOI R$: %.2f%n",total);
		}else if (codigo == 4) {
			total = quantidade * 2.00;
			System.out.printf("VOCE PEDIU "+quantidade+" TORRADA SIMPLES E O TOTAL FOI R$: %.2f%n",total);
		}else if (codigo == 5) {
			total = quantidade * 1.50;
			System.out.printf("VOCE PEDIU "+quantidade+" REFRIGERANTE E O TOTAL FOI R$: %.2f%n",total);
		}
		sc.close();

	}

}
