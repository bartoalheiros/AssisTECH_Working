package br.ufrpe.assistec.dados;

import br.ufrpe.assistec.negocio.beans.OrdemDeServico;

public interface IRepositorioOrdensServico {
	
	public void cadastrar(OrdemDeServico os);
	
	public OrdemDeServico buscar(String numero);
	
	public void remover(String numero);
	
	public void listar();
}
