package br.ufrpe.assistec.dados;

import br.ufrpe.assistec.negocio.beans.Cliente;

public class RepositorioClientesArray {
	private Cliente[] clientes;
	private int proximo;
	
	public RepositorioClientesArray() {
		this.clientes = new Cliente[100];
		this.proximo = 0;
	}
	
	public boolean cadastrar(Cliente cliente) {
		boolean resultado = false;

		if(this.validarCpf(cliente)) {
			System.out.println("Cpf jah existe!");
			return resultado;
		} else{
			this.clientes[proximo] = cliente;
			this.proximo++;
			resultado = true;
		}

		return resultado;	  
		
	}
	
	public Cliente buscarClientes(String cpf) {
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
	
	public void removerCliente(String cpf) {
		for(int i = 0; i < this.proximo; i++) {
			if( cpf.equals( this.clientes[i].getCpf() ) ) {                            //removerCadastro(String cpf) - remove o cadastro do array de clientes, seguindo as regras
				if(i == this.proximo - 1) {                                            // 1 -  se o cliente for o último do array, ou seja, se i == this.proximo - 1 
					this.clientes[i] = null;                                           // esta posição recebe null 
					this.proximo = this.proximo - 1;                                   // o próximo passa a ser ela ou seja: this.proximo = proximo - 1  
					System.out.print("Cliente Removido com Sucesso.");
					break;
				}else{
					this.clientes[i] = this.clientes[this.proximo - 1];                //Se o cliente não for o último do array
					this.clientes[this.proximo -  1] = null;                           //linha 44  o cliente na posição i, que eu encontrei, receberá o cliente da última posição
					this.proximo = this.proximo - 1;                                   //linha 45 então eu atualizo a última posição para null
					System.out.print("Cliente Removido com Sucesso.");                 // linha 46 eu atualizo o valor de próxima para próximo - 1 e a última posição passa
					break;                                                             // a ser a que era penúltima, anteriormente.
				}
			}
		}
		System.out.print("Cliente não existe.");                                       //Percorreu todo o array e n achou o cliente com aquele cpf:
	}                                                                                  // o cliente não existe.
	
	public void listarClientes() {
		if(this.proximo > 0){
			for(int i = 0; i < this.proximo; i++) {
				System.out.println(clientes[i]);
			}
		} else {
			System.out.println("Nenhum cliente cadastrado.");
		}
	}
	
	public boolean validarCpf(Cliente cliente) {
		boolean resultado = false;
		for(int i = 0; i < this.proximo; i++) {
			if(clientes[i].getCpf().equals(cliente.getCpf())) {                 //se o código do livro[i] for igual ao código do livro que passei, resultado = true.
				resultado = true;	
			}
		}

		return resultado;
	}
	
}
