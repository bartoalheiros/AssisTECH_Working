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

	public void cadastrar(Cliente c) {
		if (c == null) {
			throw new IllegalArgumentException("Parâmetro Inválido!");
		} else {
			if(!this.existe(c)) {
				this.repositorio.cadastrar(c);
			} else {
				//CpfJahExisteException
			} 
		}

	}

	public Cliente buscar(String cpf) {
		return this.repositorio.buscar(cpf);
	}
	
	
	

}
