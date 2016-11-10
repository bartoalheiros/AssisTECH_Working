package br.ufrpe.assistec.negocio;

public class EquipamentoJahEncaminhadoException extends Exception{
	
	public EquipamentoJahEncaminhadoException() {
		super("O equipamento que você está tentando cadastrar já faz parte de outra OS.");
	}
}
