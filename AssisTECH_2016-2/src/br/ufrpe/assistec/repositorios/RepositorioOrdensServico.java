
package br.ufrpe.assistec.repositorios;

import br.ufrpe.assistec.beans.OrdemServico;

public class RepositorioOrdensServico {
	private OrdemServico[] ordensServico;
	private int proxima;
	
	public RepositorioOrdensServico() {
		this.ordensServico = new OrdemServico[100];
		this.proxima = 0;
	}
	
	public void listarPorPrioridade() { 
		
	}
}
