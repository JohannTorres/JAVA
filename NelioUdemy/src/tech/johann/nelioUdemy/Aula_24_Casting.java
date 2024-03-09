package tech.johann.nelioUdemy;

public class Aula_24_Casting {

	public static void main(String[] args) {
		
		int a, b;
		double resultado;
		
		 a = 5;
		
		 b = 2;
		
		 //se a expressao da variavel resultado nao tivesse o double o resultado  iria considerar
		 //apenas o numero antes do ponto
		resultado =  (double) a / b;
		
		System.out.println(resultado);
		//System.out.println(b);
		

	}

}
