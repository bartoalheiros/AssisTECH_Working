
package br.ufrpe.assistec.dados;

import br.ufrpe.assistec.negocio.EquipamentoJahEncaminhadoException;
import br.ufrpe.assistec.negocio.OSExistenteException;
import br.ufrpe.assistec.negocio.beans.Cliente;
import br.ufrpe.assistec.negocio.beans.OrdemDeServico;

public class RepositorioOrdensServicoArray implements IRepositorioOrdensServico {
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
	
	public boolean existe(OrdemDeServico os) throws OSExistenteException {
		boolean resultado = false;
		for(int i = 0; i < this.proxima; i++) {
			if(this.ordens[i].getNumero().equals(os.getNumero())) {                 //se o código do livro[i] for igual ao código do livro que passei, resultado = true.
				resultado = true;
				throw new OSExistenteException();
			}
		}

		return resultado;
	}
	
	public OrdemDeServico buscar(String numero) throws OSNaoEncontradaException {
		OrdemDeServico ordem = null;
		
		for(int i = 0; i < this.proxima; i++) {
			if(this.ordens[i].getNumero().equals(numero)) {
				ordem = new OrdemDeServico();
				ordem = this.ordens[i];
			}
		}
		
		if(ordem == null) {
			throw new OSNaoEncontradaException();
		}
		
		return ordem;
	}
	
	public void listar() {
		if(this.proxima > 0){
			for(int i = 0; i < this.proxima; i ++) {
				System.out.print(this.ordens[i].toStringResumo());
			}
		}else{
			System.out.println("Nenhuma OS Cadastrada.");
		}	
	}
	
	public void listarOrdensPorDataEntrada() {
		if(this.proxima > 0){
			for(int i = 0; i < this.proxima; i ++) {
				System.out.print(this.ordens[i].toStringDatas());
			}
		}else{
			System.out.println("Nenhuma OS Cadastrada.");
		}
	}
	
	/*
	 * Verifica se um equipamento já está cadastrado em alguma OS do array.
	 * @param String: número de série da OS.
     * @return boolean
	 * */
	public boolean procurarEquipamento(String serie) throws EquipamentoJahEncaminhadoException {
		boolean resultado = false;
		
		for(int i = 0; i < this.proxima; i++) {
			if(this.ordens[i].getEquipamento().getNumeroSerie().equals(serie)) {
				resultado = true;
				throw new EquipamentoJahEncaminhadoException();
			}
		}

		return resultado;
	}
	
	public void remover(String numero) {
		int i = this.procurarIndice(numero);
		if(i == this.proxima - 1) {
			this.ordens[i] = null;
			this.proxima = this.proxima - 1;
			System.out.println("OS removida com sucesso.");
		}else{
			this.ordens[i] = this.ordens[this.proxima - 1];
			this.ordens[this.proxima - 1] = null;
			this.proxima = this.proxima - 1;
			System.out.print("OS removida com sucesso.");
		}
	}
	
	public int procurarIndice(String numero) {
		int indice = 0, i;
		for(i = 0; i < this.proxima; i++) { 
			if( this.ordens[i].getNumero().equals(numero) ) { 
				indice = i;
				break;
			}
		}
		if(i == this.proxima) {
			//IndiceNaoEncontradoException
		}
		
		return indice;
	}
	
	public void listarOrdensPorPrioridade() { 
		
	}
}
