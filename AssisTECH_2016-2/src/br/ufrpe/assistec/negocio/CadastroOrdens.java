package br.ufrpe.assistec.negocio;

import br.ufrpe.assistec.dados.RepositorioOrdensServicoArray;
import br.ufrpe.assistec.negocio.beans.OrdemDeServico;

public class CadastroOrdens {
	private RepositorioOrdensServicoArray repositorio;
	
	public CadastroOrdens() {
		this.repositorio = new RepositorioOrdensServicoArray();
	}
	
	public boolean existe(OrdemDeServico os) {
		return this.repositorio.existe(os);
	}
	

    /**
     * Cadastrar uma Ordem de Serviço.
     * A ordem só é cadastrada se ela não existir no repositório: 29 - if(!this.existe(os)) {...} 
     *  
     * @param OrdemDeServico
     * @return void
     *         
     */
	public void cadastrar(OrdemDeServico os) {
        if (os == null) {
            throw new IllegalArgumentException("Parâmetro inválido");
        } else {
            if (!this.existe(os)) {
                this.repositorio.cadastrar(os);
            } else {
                // contaJahExisteException
                
            }
        }        
    }
	
	public OrdemDeServico procurar(String numero) {
		return this.repositorio.procurar(numero);
	}
	
	
}
