package br.ufrpe.assistec.negocio;

import br.ufrpe.assistec.dados.IRepositorioTecnicos;
import br.ufrpe.assistec.dados.RepositorioTecnicosArray;
import br.ufrpe.assistec.negocio.beans.Tecnico;

public class ControladorTecnicos {
	private IRepositorioTecnicos repositorio;
	
	public ControladorTecnicos() {
		this.repositorio = new RepositorioTecnicosArray();
	}
	
	public boolean existe(Tecnico tecnico) {
		return ((RepositorioTecnicosArray)this.repositorio).existe(tecnico);
	}
	
	public void cadastrar(Tecnico tecnico) {
		this.repositorio.cadastrar(tecnico);
	}
	
	public void listar() { 
		((RepositorioTecnicosArray)this.repositorio).listar();
	}
	
	
	
}
