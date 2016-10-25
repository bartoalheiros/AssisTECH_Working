package br.ufrpe.assistec.negocio;

import br.ufrpe.assistec.dados.RepositorioTecnicosArray;
import br.ufrpe.assistec.negocio.beans.Tecnico;

public class ControladorTecnicos {
	private RepositorioTecnicosArray tecnicos;
	
	public ControladorTecnicos() {
		this.tecnicos = new RepositorioTecnicosArray();
	}
	
	public boolean existe(Tecnico tecnico) {
		return this.tecnicos.existe(tecnico);
	}
	
	public void cadastrar(Tecnico tecnico) {
		this.tecnicos.cadastrar(tecnico);
	}
	
	
}
