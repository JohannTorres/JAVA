package Conta;

public class Conta {
	
	int numero;
	String nome;
	double saldo;
	double limite;
	
	
	
	void Sacar(double quantidade) {
		double novoSaldo  = this.saldo - quantidade;
		this.saldo = novoSaldo;		
	}

}

