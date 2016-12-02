package br.ufrpe.assistec.negocio;

public class OSExisteException extends Exception{
	public OSExisteException() {
		super("Número de OS já cadastrado. Digite um número de OS válido");
	}
}
