package br.ufrpe.assistec.negocio;

public class OSExistenteException extends Exception{
	public OSExistenteException() {
		super("Número de OS já cadastrado. Digite um número de OS válido");
	}
}
