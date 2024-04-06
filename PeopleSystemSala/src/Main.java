import java.time.LocalDate;

import tech.johann.peoplesystemaula.composicao.*;
import tech.johann.peoplesystemaula.pessoa.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		Endereco end1 = new Endereco();
		c1.cadastrar();
		c1.setCodigo("1");
		c1.setNome("Nome 1");
		c1.setDataNascimento(LocalDate.of(1990,1,2));
		c1.setEndereco(end1);
		
		c2.setEndereco(end1);
		

	}

}
