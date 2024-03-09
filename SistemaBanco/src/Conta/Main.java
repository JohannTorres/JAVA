package Conta;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		//Conta conta3 = new Conta();
		
		
		//DADOS DA CONTA
		//NUMERO DA CONTA 1
		conta1.numero = 001;
		//NOME DA CONTA 1
		conta1.nome = "Johann";
		//SALDO CONTA 1
		conta1.saldo = 1000;
		//LIMITE CONTA
		conta1.limite = 300;
		
		conta2.numero = 002;
		conta2.nome = "Chico";
		conta2.saldo = 2000;
		conta2.limite = 400;
		
		System.out.println("Sistema de Saque");
		
		System.out.println("NUMERO CONTA:" + conta1.numero);
		System.out.println("NOME:" + conta1.nome);
		System.out.println("SALDO:" + conta1.saldo);
		System.out.println("LIMITE:" + conta1.limite);
		
		conta1.Sacar(100);
		
		System.out.println("NOVO VSALDO:" + conta1.saldo);
	

	}

}
