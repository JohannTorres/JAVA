package tech.johann.nelioUdemy;

import java.util.Locale;

public class Aula23_SaidaDados {

	public static void main(String[] args) {
		//AULA 23 NELIO - SAIDA DE DAOS EM JAVA
		
		//declaracao da variavel "x"do tipo double e recebeu o valor de 10.35784 
		double x = 10.35784;
		
		//declaração da variavel do tipo string
		String nome = "Maria";
		//declaracao da variavel idade int do tipo int
		int idade = 31;
		//declacao da variavel renda do tipo double
		double renda = 4.000;
		
		//exibe variavel com todas as casas decimais e quebra a linha
		System.out.println(x);
		
		//exibe a variavel com 2 casas decimais apos a virguka e nao quebra linha
		// %".2"%n serve para formatar a quantidade de casas decimais a serem exibidas
		System.out.printf("%.2f%n", x);
		
		//exibir o separador virgula ou ponto a depender da regiao
		//caso o computador esteja com idioma BR o separador sera virgula
		//caso o computador esteja com idioma US o separador sera ponto
		//para converter a virgula por ponto usa-se a classe locale
		Locale.setDefault(Locale.US);
		
		//concatenar(JUNTAR) varios elementos em um mesmo comando de escrita
		
		System.out.println("RESULTADO = " + x + " METROS");
		
		//concatenar(JUNTAR) varios elementos no comando de escrita usando printf
		//o marcador % serve para escrever a variavel junto com o texto, a variavel deve
		//seguir a sequencia que o % aparece anteriormente.
		System.out.printf("RESULTADO = %.3f metros%n", x);
		
		//concatenar(JUNTAR) varios elementos em um mesmo comando de escrita
		//usando string
		System.out.printf("%s tem %d anos e ganha R$ %.3f reais%n", nome, idade, renda);
		
		
		// %f ponto flutuante
		// %d inteiro
		// %s texto
		// %n quebra de linha
		

	}

}
