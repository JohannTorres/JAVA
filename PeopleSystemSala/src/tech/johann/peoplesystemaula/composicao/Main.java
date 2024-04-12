package tech.johann.peoplesystemaula.composicao;
import java.time.LocalDate;

import tech.johann.peoplesystemaula.pessoa.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		Endereco end1 = new Endereco("rua end1", "num end1", "cep en1", "cidade end1", "estado en1", "pais end1");
		c1.cadastrar();
		c1.setCodigo("1");
		c1.setNome("Nome 1");
		c1.setDataNascimento(LocalDate.of(1990,1,2));
		c1.setEndereco(end1);
		System.out.println("Nome do cliente: " + c1.getNome());
		System.out.println("Rua do cliente: " + c1.getEndereco().getRua());
		c1.getEndereco().setRua("O cara mudou de rua");
		System.out.println("Rua do cliente: " + c1.getEndereco().getRua());
		
		

	}

}
