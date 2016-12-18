package br.ufrpe.assistec.negocio;

public class EquipamentoNaoExisteException extends Exception{
	public EquipamentoNaoExisteException() {
		super("O equipamento que você procurou não existe.");
	}
}
