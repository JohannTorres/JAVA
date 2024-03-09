package tech.johann.ContaSystemHeranca;

public class Conta {
		
		int numero;
		double saldo;
		double limite;
		int quantidade;

		boolean sacar(double val) {
			if (this.saldo >= val) {
				this.saldo = this.saldo - val;
				return true;
			} else {
				System.out.println("SEM SALDO!");
				return false;
			}
			
		}

		boolean depositar(double val) {
			if (val < 0) {
				return false;
			} else {
				this.saldo = this.saldo + val;
				return true;
			}
		}
		
		//RETORNA O SALDO DO OBJETO (Conta)
		double getSaldo() {
			return saldo;
		}

}