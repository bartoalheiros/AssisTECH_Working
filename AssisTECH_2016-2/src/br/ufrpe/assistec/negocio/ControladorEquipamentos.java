package br.ufrpe.assistec.negocio;

import br.ufrpe.assistec.dados.IRepositorioEquipamentos;
import br.ufrpe.assistec.dados.RepositorioEquipamentosArray;
import br.ufrpe.assistec.negocio.beans.Equipamento;

public class ControladorEquipamentos {
	private IRepositorioEquipamentos repositorio;
	
	public ControladorEquipamentos() {
		this.repositorio = new RepositorioEquipamentosArray();
	}
	
	/*
	 * Cadastra um equipamento no array de equipamentos, somente se 
	 * não existir nenhum equipamento cadastrado com o mesmo número de série do equipamento passado
	 * como parâmetro.
	 * 
	 * */
	public void cadastrar(Equipamento e) throws EquipamentoExisteException {
		
		if(((RepositorioEquipamentosArray)this.repositorio).existe(e)) {
			throw new EquipamentoExisteException();
		}else {
			this.repositorio.cadastrar(e);
		}
		
		
		
	}
	
	public Equipamento buscar(String numero) throws EquipamentoNaoExisteException{ 
		Equipamento equip = null;
		equip = this.repositorio.buscar(numero);
		
		if(equip == null) {
			throw new EquipamentoNaoExisteException();
		}
		
		return equip;
	}
	
	public void remover(String numero) throws EquipamentoExisteException {
		if(((RepositorioEquipamentosArray)this.repositorio).existeEquipSerie(numero)) {
			throw new EquipamentoExisteException();
		}else {
			((RepositorioEquipamentosArray)this.repositorio).remover(numero);
		}
	}
	
	public void atualizar(Equipamento equip) throws EquipamentoNaoExisteException {
		
	}
	
}
