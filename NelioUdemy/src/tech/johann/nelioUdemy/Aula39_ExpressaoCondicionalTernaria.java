package tech.johann.nelioUdemy;

import java.util.Scanner;

public class Aula39_ExpressaoCondicionalTernaria {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double preco = 34.5;
		
		//expressao condicional ternaria
		double desconto = (preco < 20.0) ? preco *0.1 : preco * 0.05;
		
		//estrutura de if else tera o mesmo resultado
		//if (preco < 20.0) {
		//	desconto = preco * 0.1;
		//}
		//else {
		//	desconto = preco * 0.05;
		//}
		
		System.out.println(desconto);
		sc.close();
	}

}