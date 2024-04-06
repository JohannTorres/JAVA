package tech.johann.peoplesystem;


public class Cliente extends Pessoa{
	private String registroAluno;
	private String dataMatricula;

	//construtor
	public Cliente(String nome, String rg,String dataNascimento, String registroAluno, String dataMatricula){
		super(nome,rg,dataNascimento, null);
		this.registroAluno = registroAluno;
		//this.dataMatricula = new Data(dataMatricula);
	}

	//gets
	public String getRa(){
		return this.registroAluno;
	}
	public String getDataMatricula(){
		return this.dataMatricula.toString();
	}

	//sets
	public void setRa(String registroAluno){
		this.registroAluno = registroAluno;
	}
	//public void setDataMatricula(String dataMatricula){
	//	this.dataMatricula.setData(dataMatricula);
	//}
}