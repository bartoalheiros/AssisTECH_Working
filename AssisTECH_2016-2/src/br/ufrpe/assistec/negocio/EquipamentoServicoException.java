package br.ufrpe.assistec.negocio;

public class EquipamentoServicoException extends Exception{
	private String numSerie;
	
	public EquipamentoServicoException(String numSerie) {
		super("O equipamento que você está tentando cadastrar já faz parte de outra OS.");
		this.numSerie = numSerie;
	}
	
	public void mostrarEquipamentoOrdem() {
		
	}
}
