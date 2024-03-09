package tech.johann.nelioUdemy;

import java.util.Locale;
import java.util.Scanner;

public class Aula37_SintaxeOpicional {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int minutos;
		double conta = 50.0;

		System.out.println("DIGITE A QUANTIDADE DE MINUTOS CONSUMIDAS");
		
		minutos = sc.nextInt(); 
		
		if (minutos > 100.0) {
			conta += (minutos - 100) * 2.0;
		} 
		
		System.out.printf("Valor a Pagar: R$ %.2f%n", conta);
		
		sc.close();
		
	}

}
