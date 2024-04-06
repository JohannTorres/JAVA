package tech.johann.peoplesystem;

import java.sql.Date;

public class Pessoa {
	String registroGeral;
	String nome;
	Date dataNascimento; 
	
	public Pessoa(String nome, String registroGeral, String dataString, Date dataNascimento){
		
		this.nome = nome;
		this.registroGeral = registroGeral;
		this.dataNascimento = dataNascimento;
	     }
		
		//gets
		public String getNome(){
			return this.nome;
		}
		public String getCodigo(){
			return this.registroGeral;
		}
		
		public String getData(){
			return this.dataNascimento.toString();
		}
		
		//sets
		public void setNome(String nome) {
			this.nome = nome;
		}
		public void setCodigo(String registroGeral) {
			this.registroGeral = registroGeral;
		}
	
}

