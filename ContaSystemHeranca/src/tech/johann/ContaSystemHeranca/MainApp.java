package tech.johann.ContaSystemHeranca;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//CRIAR CONTA;
		Conta conta1 = new Conta();
		Conta conta2 = new Conta(2, 2);
		Conta conta3 = new Conta(3);
		
		ContaEspecial
		
		
		//INICIALIZAR VARIAVEIS
		//conta1.numero = 001;
		//SALDO CONTA 1
		//conta1.saldo = 1000;
		
		
		//SALDO ATUAL
		System.out.println("SALDO ATUAL");
		System.out.println(conta1.saldo);
		
		System.out.println("INFORME O VALOR A SACAR");
		//SACAR VALOR
		if (conta1.sacar(sc.nextDouble())) {
			System.out.println("NOVO SALDO APOS SAQUE");
			System.out.println(conta1.getSaldo());
		};
		
		//DEPOSITAR VALOR
		System.out.println("INFORME O VALOR A DEPOSITAR");
		if (conta1.depositar(sc.nextDouble())) {
			System.out.println("NOVO SALDO APOS DEPOSITO");
			System.out.println(conta1.getSaldo());
		};
		
	}

}
