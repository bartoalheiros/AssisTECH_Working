package br.ufrpe.assistec.negocio;

import br.ufrpe.assistec.negocio.beans.Cliente;
import br.ufrpe.assistec.negocio.beans.OrdemDeServico;
import br.ufrpe.assistec.negocio.beans.Tecnico;

public class ServidorAssisTech {
	private ControladorClientes clientes;
	private ControladorTecnicos tecnicos;
	private ControladorOrdens ordens;
	
	private static ServidorAssisTech instance;
	
	private ServidorAssisTech() {
		// Construtor privado para evitar instancia��o fora da classe
		this.clientes = new ControladorClientes();
		this.tecnicos = new ControladorTecnicos();
		this.ordens = new ControladorOrdens();
	}
	
	
	/**
	 * Implementando padr�o Singleton
	 * 
	 * @return A inst�ncia da desta fachada
	 */
	public static ServidorAssisTech getInstance() {
		if(instance == null) {
			instance = new ServidorAssisTech();
		}
		
		return instance;
	}
	
	 public void cadastrarCliente(Cliente c) { 
		 clientes.cadastrar(c);
	 }
	 
	 public boolean existeCliente(Cliente c) { 
		 return clientes.existe(c);
	 }
	 
	 public Cliente buscarCliente(String cpf) {
		 return clientes.buscar(cpf);
	 }
	 
	 public boolean existeTecnico(Tecnico tecnico) {
		 return tecnicos.existe(tecnico);
	 }
	 
	 public void cadastrarTecnico(Tecnico tecnico) {
		 tecnicos.cadastrar(tecnico);
	 }
	 
	 public boolean existeOrdem(OrdemDeServico os) {
		 return ordens.existe(os);
	 }
	 
	 public void cadastrarOrdem(OrdemDeServico os) {
		 ordens.cadastrar(os);
	 }
}
