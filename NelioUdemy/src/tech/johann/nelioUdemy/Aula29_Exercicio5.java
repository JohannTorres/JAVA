package tech.johann.nelioUdemy;


import java.util.Locale;
import java.util.Scanner;

public class Aula29_Exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int codPeca1, codPeca2, quantPeca1, quantPeca2;
		double valorPeca1, valorPeca2, total;
		
		System.out.println("DIGITE O CODIGO DA PEÇA");
		codPeca1 = sc.nextInt();
		System.out.println("DIGITE A QUANTIDADE DE PEÇAS");
		quantPeca1 = sc.nextInt();
		System.out.println("DIGITE O VALOR DA PEÇA");
		valorPeca1 = sc.nextDouble();
		System.out.println("DIGITE O CODIGO DA PEÇA 2");
		codPeca2 = sc.nextInt();
		System.out.println("DIGITE O NUMERO DE PEÇAS 2");
		quantPeca2 = sc.nextInt();
		System.out.println("DIGITE O VALOR DA PEÇA 2");
		valorPeca2 = sc.nextDouble();
		
		total = (quantPeca1 * valorPeca1) + (quantPeca2 * valorPeca2);
		
		System.out.println("PEDIDO 01");
		System.out.println("CODIGO DA PEÇA PEDIDA: "+ codPeca1);
		System.out.println("QUANTIDADE DA PEÇA PEDIDA: "+ quantPeca1);
		System.out.println("VALOR UNITARIO DA PEÇA PEDIDA:"+ valorPeca1);
		
		System.out.println("\nPEDIDO 02");
		System.out.println("CODIGO DA PEÇA PEDIDA: "+ codPeca1);
		System.out.println("QUANTIDADE DA PEÇA PEDIDA: "+ quantPeca1);
		System.out.println("VALOR DA PEÇA PEDIDA: "+ valorPeca1);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
		
	}

}
