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
	
	public Tecnico buscar(String mat){
		return ((RepositorioTecnicosArray)this.repositorio).buscar(mat); 
	}
	
	public void cadastrar(Tecnico tecnico) {
		this.repositorio.cadastrar(tecnico);
	}
	
	public void listar() { 
		((RepositorioTecnicosArray)this.repositorio).listar();
	}
	
	public void remover(String mat) throws TecnicoNaoCadastradoException { 
		if(this.buscar(mat) != null) {
			((RepositorioTecnicosArray)this.repositorio).remover(mat);
		}else{
			throw new TecnicoNaoCadastradoException(mat);
		}
	}
	
}
