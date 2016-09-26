
package br.ufrpe.assistec.repositorios;

import br.ufrpe.assistec.beans.Cliente;
import br.ufrpe.assistec.beans.OrdemServico;

public class RepositorioOrdensServico {
	private OrdemServico[] ordens;
	private int proxima;
	
	public RepositorioOrdensServico() {
		this.ordens = new OrdemServico[100];
		this.proxima = 0;
	}
	
	public void cadastrarOS(OrdemServico ordemServico) {

		if(this.validarNumero(ordemServico)) {
			System.out.println("Os já registrada.");
		} else{
			this.ordens[this.proxima] = ordemServico;
			this.proxima++;
		}
	}
	
	public boolean validarNumero(OrdemServico os) {
		boolean resultado = false;
		for(int i = 0; i < this.proxima; i++) {
			if(this.ordens[i].getNumero().equals(os.getNumero())) {                 //se o código do livro[i] for igual ao código do livro que passei, resultado = true.
				resultado = true;	
			}
		}

		return resultado;
	}
	
	public OrdemServico buscarOS(String numero) {
		OrdemServico ordem = null;
		
		for(int i = 0; i < this.proxima; i++){
			if(this.ordens[i].getNumero().equals(numero)){
				ordem = new OrdemServico();
				ordem = this.ordens[i];
			}
		}
		
		return ordem;
	}
	
	public void listarOrdens() {
		if(this.proxima > 0){
			for(int i = 0; i < this.proxima; i ++) {
				System.out.print(this.ordens[i]);
			}
		}else{
			System.out.println("Nenhuma OS Cadastrada.");
		}	
	}
	
	public boolean removerOS(String numero) {
		boolean resultado = false;
		for(int i = 0; i < this.proxima; i++) {
			if( this.ordens[i].getNumero().equals(numero) ) {
				if(i == this.proxima - 1) {
					this.ordens[i] = null;
					this.proxima = this.proxima - 1;
					resultado = true;
					System.out.println("OS removida com sucesso.");
				}else{
					this.ordens[i] = this.ordens[this.proxima - 1];
					this.ordens[this.proxima - 1] = null;
					this.proxima = this.proxima - 1;
					resultado = true;
					System.out.print("OS removida com sucesso.");
				}
			}
		}
		return resultado;
	}
	
	public void listarOrdensPorPrioridade() { 
		
	}
}
