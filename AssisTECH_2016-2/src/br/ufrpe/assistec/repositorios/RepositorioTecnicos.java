package br.ufrpe.assistec.repositorios;

import br.ufrpe.assistec.beans.Tecnico;

public class RepositorioTecnicos {
	private Tecnico[] tecnicos;
	private int proximo;
	
	public RepositorioTecnicos() {
		this.tecnicos = new Tecnico[100];
		this.proximo = 0;
	}
	
	public boolean validarMatricula(Tecnico tecnico) {
		boolean resultado = false;
		
		for(int i = 0; i < this.proximo; i++) {
			if(this.tecnicos[i].getMatricula().equals(tecnico.getMatricula())){
				resultado = true;
			}
		}
		
		return resultado;
	}
	
	public void inserirTecnico(Tecnico tecnico) {
		if(this.validarMatricula(tecnico)) {
			System.out.println("Técnico comn esta matrícula já existe.");
		} else{
			this.tecnicos[this.proximo] = tecnico;
			this.proximo++;
		}
	}
}
