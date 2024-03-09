package tech.johann.nelioUdemy;

import java.util.Scanner;

public class Aula32_If_Else_Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int duracao, horaInicio, horaFim;
		
		System.out.println("HORA INICIO");
		horaInicio = sc.nextInt();
		System.out.println("HORA FIM");
		horaFim = sc.nextInt();
		
		if (horaInicio < horaFim) {
		duracao = (horaInicio - horaFim);
		
		}
		else {
		duracao = 24 - horaInicio + horaFim;
		}
		System.out.println("O JOGO DUROU "+duracao+" HORA(S)");
		
		sc.close();
	}

}
