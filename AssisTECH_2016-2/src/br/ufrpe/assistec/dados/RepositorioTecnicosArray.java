package br.ufrpe.assistec.dados;

import br.ufrpe.assistec.negocio.beans.Tecnico;

public class RepositorioTecnicosArray implements IRepositorioTecnicos {
	private Tecnico[] tecnicos;
	private int proximo;
	
	public RepositorioTecnicosArray() {
		this.tecnicos = new Tecnico[100];
		this.proximo = 0;
	}
	
	public boolean existe(Tecnico tecnico) {
		boolean resultado = false;
		
		for(int i = 0; i < this.proximo; i++) {
			if(this.tecnicos[i].getMatricula().equals(tecnico.getMatricula())){
				resultado = true;
			}
		}
		
		return resultado;
	}
	
	public void cadastrar(Tecnico tecnico) {
		if(this.existe(tecnico)) {
			//TecnicoJahExisteException
		} else{
			this.tecnicos[this.proximo] = tecnico;
			this.proximo++;
		}
	}
	
	public int procurarIndice(String matr) {
		int indice = 0, i;
		for(i = 0; i < this.proximo; i++) { 
			if( this.tecnicos[i].getMatricula().equals(matr) ) { 
				indice = i;
				break;
			}
		}
		if(i == this.proximo) {
			//IndiceNaoEncontradoException
		}
		
		return indice;
	}
}
