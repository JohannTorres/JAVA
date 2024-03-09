package geral;

public class MainApp {

	public static void main(String[] args) {
//		Imprime no console
		//System.out.println("Bom dia, MEU POVO!");
		
//		variáveis dos objetos (redundância obrigatória)
		//Auxiliar auxiliar1 = new Auxiliar();
		//Auxiliar auxiliar2 = new Auxiliar();
		Auxiliar auxiliar3 = new Auxiliar();
		
		//auxiliar1.exibirTexto();
		//auxiliar2.mudarNumero();
		//auxiliar1.exibirNumero();
		//auxiliar2.exibirNumero();
		System.out.println("Exibir Texto Auxiliar 3");
		auxiliar3.exibirTexto();
		System.out.println("Exibir Numero Auxiliar 3");
		auxiliar3.mudarNumero();
		System.out.println("Exibir Novo Numero Auxiliar 3");
		auxiliar3.exibirNumero();
		System.out.println("Soma de 2 numeros usando metodo soma");
		auxiliar3.soma(10,10);
	}

}

