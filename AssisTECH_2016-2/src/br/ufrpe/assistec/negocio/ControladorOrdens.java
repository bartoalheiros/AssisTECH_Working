package br.ufrpe.assistec.negocio;

import br.ufrpe.assistec.dados.OSNaoEncontradaException;
import br.ufrpe.assistec.dados.RepositorioOrdensServicoArray;
import br.ufrpe.assistec.negocio.beans.OrdemDeServico;

public class ControladorOrdens {
	private RepositorioOrdensServicoArray repositorio;
	
	public ControladorOrdens() {
		this.repositorio = new RepositorioOrdensServicoArray();
	}
	
	public boolean existe(OrdemDeServico os) throws OSExistenteException {
		return this.repositorio.existe(os);
	}
	

    /**
     * Cadastrar uma Ordem de Serviço.
     * A ordem só é cadastrada se ela não existir no repositório: 29 - if(!this.existe(os)) {...} 
     *  
     * @param OrdemDeServico
     * @return void
     * @throws OSExistenteException 
     * @throws EquipamentoJahEncaminhadoException 
     *         
     */
	public void cadastrar(OrdemDeServico os) throws OSExistenteException, EquipamentoJahEncaminhadoException {
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
	
	public boolean procurarEquipamento(String serie) throws EquipamentoJahEncaminhadoException {
		return this.repositorio.procurarEquipamento(serie);
	}
}
