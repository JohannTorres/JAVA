package tech.johann.peoplesystemaula.pessoa;

import java.time.LocalDate;

import tech.johann.peoplesystemaula.composicao.*;
import tech.johann.peoplesystemaula.pessoa.*;

public class Funcionario extends Pessoa{
	
	private String matricula;
	
	private Cargo cargo;
	
	private double salario;
	
	private LocalDate dataAdmissao;
	
	public Funcionario(){
		System.out.println("Criando funcionario vazio!");
		
	}
	
	public Funcionario(String nome, LocalDate dataNascimento, Cargo cargo, double salario, LocalDate dataAdmissao) {
		super(nome, dataNascimento, endereco, telsContato);
		this.cargo = cargo;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
		this.endereco = endereco;
	}
	
	//reajusta salario
	public void reajustarSalario(double percentual) {
		this.salario = this.salario * (1 + (percentual/100));
		
	}
	
	//promove cargo
	public void promover(Cargo novoCargo) {
		this.cargo = novoCargo;
		
	}

	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Cargo getCargo() {
		return cargo;
	}

	//public void setCargo(Cargo cargo) {
	//	this.cargo = cargo;
	//}

	public double getSalario() {
		return salario;
	}

	public void setSalario(Float salario) {
		this.salario = salario;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public void cadastrar() {
		
	}
	
	public int obterIdade() {	
		
	}
}
