package br.ufrpe.assistec.negocio;

import br.ufrpe.assistec.dados.IRepositorioClientes;
import br.ufrpe.assistec.dados.RepositorioClientesArray;
import br.ufrpe.assistec.negocio.beans.Cliente;

public class ControladorClientes {
	private IRepositorioClientes repositorio;

	public ControladorClientes() {
		this.repositorio = new RepositorioClientesArray();
	}

	public boolean existe(Cliente c) {
		return ((RepositorioClientesArray)this.repositorio).existe(c);
	}

	public void cadastrar(Cliente c) throws ClienteJahCadastradoException {
		if (c == null) {
			throw new IllegalArgumentException("Parâmetro Inválido!");
		} else {
			if(!this.existe(c)) {
				this.repositorio.cadastrar(c);
			} else {
				String cpf = c.getCpf();
				throw new ClienteJahCadastradoException(cpf);
			} 
		}

	}

	public Cliente buscar(String cpf) {
		return this.repositorio.buscar(cpf);
	}
	
	public void alterar (Cliente c) throws ClienteNaoCadastradoException {
		if(this.existe(c)){
			((RepositorioClientesArray)this.repositorio).alterar(c);
		}else {
			String cpf = c.getCpf();
			throw new ClienteNaoCadastradoException(cpf);
		}
	}
	
	public void remover(String cpf) throws ClienteNaoCadastradoException {
		if(this.buscar(cpf) != null){
			((RepositorioClientesArray)this.repositorio).remover(cpf);
		}else {
			throw new ClienteNaoCadastradoException(cpf);
		}
	}
	
	public void listar() { 
		((RepositorioClientesArray)this.repositorio).listar();
	}
	

}
