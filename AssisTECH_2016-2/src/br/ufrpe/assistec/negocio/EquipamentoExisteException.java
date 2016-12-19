package br.ufrpe.assistec.negocio;

public class EquipamentoExisteException extends Exception {
	
	private String numSerie;
	
	public EquipamentoExisteException(String numSerie){
		super("O equipamento que você está tentando cadastrar no sistema, já existe.");
		this.numSerie = numSerie;
	}
	
	public EquipamentoExisteException(){
		super("O equipamento que você está tentando cadastrar no sistema, já existe.");
	}
	
	public String getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

}
