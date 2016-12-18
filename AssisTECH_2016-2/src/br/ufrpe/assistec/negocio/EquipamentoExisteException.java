package br.ufrpe.assistec.negocio;

public class EquipamentoExisteException extends Exception {
	public EquipamentoExisteException(){
		super("O equipamento que você está tentando cadastrar no sistema, já existe.");
	}
}
