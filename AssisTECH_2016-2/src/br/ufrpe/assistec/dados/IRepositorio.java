package br.ufrpe.assistec.dados;

import br.ufrpe.assistec.negocio.beans.Cliente;

public interface IRepositorio {
	public boolean cadastrar(Cliente cliente);
}
