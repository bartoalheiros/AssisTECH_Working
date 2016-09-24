package br.ufrpe.assistec.repositorios;

import br.ufrpe.assistec.beans.Cliente;

public class RepositorioClientes {
	Cliente[] clientes;
	private int proximo;
	
	public RepositorioClientes() {
		this.clientes = new Cliente[100];
		this.proximo = 0;
	}
	
	public void cadastrar(Cliente cliente) {
		if(cliente != null) {
			this.clientes[proximo] = cliente;
			this.proximo++;
		}
	}
	
	public Cliente procurar(String cpf) {
		Cliente cliente = null;
		for(int i = 0; i < this.proximo; i++) {
			if( cpf.equals( this.clientes[i].getCpf() ) ) {
				cliente = new Cliente();
				cliente = this.clientes[i];
				
				break;
			}
		}
		
		return cliente;
	}
	
	public void removerCadastro(String cpf) {
		for(int i = 0; i < this.proximo; i++) {
			if( cpf.equals( this.clientes[i].getCpf() ) ) {
				
			}
		}
	}
	
}
