package tech.johann.peoplesystemaula.pessoa;

import java.time.LocalDate;

import tech.johann.peoplesystemaula.composicao.*;
import tech.johann.peoplesystemaula.pessoa.*;


public class Funcionario extends Pessoa{
	
	private int matricula;
	
	private Cargo cargo;
	
	private double salario;
	
	private LocalDate dataAdmissao;
	
	public Funcionario(){
		System.out.println("Criando funcionario vazio!");
		
	}
	
	public Funcionario(String nome, LocalDate dataNascimento, Endereco endereco, Telefone telsContato, int matricula, Cargo cargo, double salario, LocalDate dataAdmissao) {
		super(nome, dataNascimento, endereco, telsContato);
		this.matricula = matricula;
		this.cargo = cargo;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
	}
	
	
	//reajusta salario
	public void reajustarSalario(double percentual) {
		this.salario = this.salario * (1 + (percentual/100));
		
	}
	
	//promove cargo
	public void promover(Cargo novoCargo) {
		this.cargo = novoCargo;
		
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	

}
