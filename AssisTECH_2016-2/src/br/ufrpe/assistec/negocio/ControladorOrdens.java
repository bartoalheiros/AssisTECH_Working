package br.ufrpe.assistec.negocio;

import br.ufrpe.assistec.dados.OSNaoEncontradaException;
import br.ufrpe.assistec.dados.RepositorioOrdensServicoArray;
import br.ufrpe.assistec.negocio.beans.OrdemDeServico;


public class ControladorOrdens {
	private RepositorioOrdensServicoArray repositorio;
	
	public ControladorOrdens() {
		this.repositorio = new RepositorioOrdensServicoArray();
	}
	
	public boolean existe(OrdemDeServico os) throws OSExisteException {
		return this.repositorio.existe(os);
	}
	

    /**
     * Cadastrar uma Ordem de Serviço.
     * A ordem só é cadastrada se ela não existir no repositório: 29 - if(!this.existe(os)) {...} 
     *  
     * @param OrdemDeServico
     * @return void
     * @throws OSExisteException 
     * @throws EquipamentoEmServicoException 
     *         
     */
	public void cadastrar(OrdemDeServico os) throws OSExisteException, EquipamentoEmServicoException {
        if (os == null) {
            throw new IllegalArgumentException("Parâmetro inválido");
        } else {
            if (!this.existe(os)) {
            	if(!this.procurarEquipamento(os.getEquipamento().getNumeroSerie())) {
            		this.repositorio.cadastrar(os);
            	}
           }
        }        
    }
	
	public OrdemDeServico buscarOrdem(String numero) throws OSNaoEncontradaException {
		return this.repositorio.buscar(numero);
	}
	
	public void removerOS(String numero) {
		this.repositorio.remover(numero);
	}
	
	public void listar() {
		this.repositorio.listar();
	}
	
	public boolean validarEquipamento(String serie) throws EquipamentoEmServicoException {
		return this.repositorio.validarEquipamento(serie);
	}
	
	public boolean procurarEquipamento(String serie) throws EquipamentoEmServicoException {
		return this.repositorio.procurarEquipamento(serie);
	}
	
	public void alterar(OrdemDeServico os, String tipo, Object o) throws EquipamentoEmServicoException {
		if(os == null) {
			throw new IllegalArgumentException("Os Nula!");
		} else {
		
			this.repositorio.alterar(os, tipo, o);
		
		}
	}
}
