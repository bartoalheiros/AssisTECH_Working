package br.ufrpe.assistec.dados;

import br.ufrpe.assistec.negocio.beans.Equipamento;

public interface IRepositorioEquipamentos {

	public void cadastrar(Equipamento equip);
	
	public Equipamento buscar(String numeroDeSerie);
	
	public void remover(String numero);
	
	public void listar();
}
