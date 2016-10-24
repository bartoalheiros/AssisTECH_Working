
package br.ufrpe.assistec.dados;

import br.ufrpe.assistec.negocio.beans.Cliente;
import br.ufrpe.assistec.negocio.beans.OrdemDeServico;

public class RepositorioOrdensServicoArray {
	private OrdemDeServico[] ordens;
	private int proxima;
	
	public RepositorioOrdensServicoArray() {
		this.ordens = new OrdemDeServico[100];
		this.proxima = 0;
	}
	
	public void cadastrar(OrdemDeServico os) {
		this.ordens[this.proxima] = os;
		this.proxima++;
	}
	
	public boolean existe(OrdemDeServico os) {
		boolean resultado = false;
		for(int i = 0; i < this.proxima; i++) {
			if(this.ordens[i].getNumero().equals(os.getNumero())) {                 //se o código do livro[i] for igual ao código do livro que passei, resultado = true.
				resultado = true;	
			}
		}

		return resultado;
	}
	
	public OrdemDeServico procurar(String numero) {
		OrdemDeServico ordem = null;
		
		for(int i = 0; i < this.proxima; i++){
			if(this.ordens[i].getNumero().equals(numero)){
				ordem = new OrdemDeServico();
				ordem = this.ordens[i];
			}
		}
		
		return ordem;
	}
	
	public void listarOrdens() {
		if(this.proxima > 0){
			for(int i = 0; i < this.proxima; i ++) {
				System.out.print(this.ordens[i].toStringShort());
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
