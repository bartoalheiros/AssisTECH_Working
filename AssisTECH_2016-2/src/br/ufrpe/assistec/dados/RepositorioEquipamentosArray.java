package br.ufrpe.assistec.dados;

import br.ufrpe.assistec.negocio.EquipamentoNaoExisteException;
import br.ufrpe.assistec.negocio.beans.Equipamento;

public class RepositorioEquipamentosArray implements IRepositorioEquipamentos{
	private Equipamento[] equipamentos;
	private int proximo;
	
	public RepositorioEquipamentosArray(){
		this.equipamentos = new Equipamento[100];
		this.proximo = 0;
	}
	
	@Override
	public void cadastrar(Equipamento e) {
		this.equipamentos[this.proximo] = e;
		this.proximo++;
		
	}

	@Override
	public void listar() {
		for(int i = 0; i < this.proximo; i++) {
			System.out.println(this.equipamentos[i]);
		}
		
	}

	public Equipamento[] getEquipamentos() {
		return equipamentos;
	}

	public int getProximo() {
		return proximo;
	}

	@Override
	public void remover(String numero) {
		int i = this.procurarIndice(numero);
		if(i == this.proximo - 1) {
			this.equipamentos[i] = null;
			this.proximo = this.proximo - 1;
			System.out.println("Equipamento removido com sucesso.");
		}else{
			this.equipamentos[i] = this.equipamentos[this.proximo - 1];
			this.equipamentos[this.proximo - 1] = null;
			this.proximo = this.proximo - 1;
			System.out.print("Equipamento removido com sucesso.");
		}
	}
	
	public boolean existe(Equipamento equip) {
		boolean resultado = false;
		String numSerie = equip.getNumeroSerie();
		
		for(int i = 0; i < this.proximo; i++) {
			
			if(numSerie.equals(this.equipamentos[i].getNumeroSerie()))
			{
				resultado = true;
			}
		}
		
		return resultado;
	}
	
	public boolean existeEquipSerie(String numSerie) {
		boolean resultado = false;
		
		for(int i = 0; i < this.proximo; i++) {
			
			if(numSerie.equals(this.equipamentos[i].getNumeroSerie()))
			{
				resultado = true;
			}
		}
		
		return resultado;
	}


	@Override
	public Equipamento buscar(String numero){
		Equipamento equip = null;
		
		for(int i = 0; i < this.proximo; i++) {
			if(this.equipamentos[i].getNumeroSerie().equals(numero)) {
				equip = new Equipamento();
				equip = this.equipamentos[i];
			}
		}
		
		return equip;
	}
	
	/*Este equipamento já está cadastrado em alguma OS?
	 * Se sim, devolve: o número de série da OS.
	 * Se não, devolve: 0
	 * @param: número de série do equipamento.*/
	public String osEquipamento(String numSerie){
		String numeroOS;
		Equipamento equip = new Equipamento();
		
		if((equip = this.buscar(numSerie)) == null) {
			numeroOS = "0";
		}else{
			numeroOS = equip.getOs(); 
		}
		
		return numeroOS;
	}
	
	/*
	 * @param: número de série do equipamento(String).
	 * 
	 * */
	public int procurarIndice(String num) {
		int indice = 0, i;
		for(i = 0; i < this.proximo; i++) { 
			if( this.equipamentos[i].getNumeroSerie().equals(num) ) { 
				indice = i;
				break;
			}
		}
		
		return indice;
	}
	
	public int procurarIndice(Equipamento e) {
		String num = e.getNumeroSerie();
		int indice = 0, i;
		for(i = 0; i < this.proximo; i++) { 
			if( this.equipamentos[i].getNumeroSerie().equals(num) ) { 
				indice = i;
				break;
			}
		}
		
		return indice;
	} 

	@Override
	public void atualizar(Equipamento equip) throws EquipamentoNaoExisteException {
		int i;
		
		if(this.existe(equip)) {
			i = procurarIndice(equip);
		} else {
			throw new EquipamentoNaoExisteException();
		}
		
		
	}
	
}
