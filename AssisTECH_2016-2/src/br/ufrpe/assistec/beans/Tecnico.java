package br.ufrpe.assistec.beans;

public class Tecnico extends Usuario {
	private String matricula;
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}
