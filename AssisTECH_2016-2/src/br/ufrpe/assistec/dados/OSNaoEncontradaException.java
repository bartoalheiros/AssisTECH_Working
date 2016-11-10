package br.ufrpe.assistec.dados;

public class OSNaoEncontradaException extends Exception {
	public OSNaoEncontradaException(){
		super("OS não existe. Digite um número válido ou 1 e Enter para voltar ao Menu Principal");
	}
}
