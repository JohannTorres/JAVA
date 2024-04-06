package tech.johann.peoplesystemaula.pessoa;

import tech.johann.peoplesystemaula.composicao.Profissao;

public class Cliente extends Pessoa{
	
	private String codigo;
	
	private Profissao profissao;
	
	
	public Cliente(){
		System.out.println("Criando cliente vazio!");
		
	}

	public Cliente(String codigo, Profissao profissao) {
		super();
		this.codigo = codigo;
		this.profissao = profissao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Profissao getProfissao() {
		return profissao;
	}

	public void setProfissao(Profissao profissao) {
		this.profissao = profissao;
	}

}
