package tech.johann.peoplesystem;

public class Funcionario extends Pessoa {
	
	private double salario;
	private String funcao;
	private Date dataAdmissao;

	//construtor
	public Funcionario(String nome, String registroGeral,String dataNascimento, double salario,String funcao, String dataAdmissaoString){
		super(nome,registroGeral,dataNascimento, null);
		this.salario = salario;
		this.funcao = funcao;
		this.dataAdmissao = new Data(dataAdmissaoString);
	}

	//gets
	public double getSalario(){
		return this.salario;
	}
	public String getFuncao(){
		return this.funcao;
	}
	public String getDataAdmissao(){
		return this.dataAdmissao.toString();
	}

	//sets
	public void setSalario(double salario){
		this.salario = salario;
	}
	public void setFuncao(String funcao){
		this.funcao = funcao;
	}
	public void setDataAdimissao(String dataString){
		this.dataAdmissao.setData(dataString);
	}
	
	
	

}
