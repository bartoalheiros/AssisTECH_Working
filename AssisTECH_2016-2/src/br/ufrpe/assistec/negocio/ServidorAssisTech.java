package br.ufrpe.assistec.negocio;

import br.ufrpe.assistec.dados.OSNaoEncontradaException;
import br.ufrpe.assistec.negocio.beans.Cliente;
import br.ufrpe.assistec.negocio.beans.Equipamento;
import br.ufrpe.assistec.negocio.beans.Ordem;
import br.ufrpe.assistec.negocio.beans.Tecnico;

public class ServidorAssisTech {
	private ControladorClientes clientes;
	private ControladorTecnicos tecnicos;
	private ControladorOrdens ordens;
	private ControladorEquipamentos equipamentos;
	
	private static ServidorAssisTech instance;
	
	private ServidorAssisTech() {
		// Construtor privado para evitar instancia��o fora da classe
		this.clientes = new ControladorClientes();
		this.tecnicos = new ControladorTecnicos();
		this.ordens = new ControladorOrdens();
		this.equipamentos = new ControladorEquipamentos();
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
	
	 public void cadastrarCliente(Cliente c) throws ClienteJahCadastradoException { 
		 clientes.cadastrar(c);
	 }
	 
	 public boolean existeCliente(Cliente c) { 
		 return clientes.existe(c);
	 }
	 
	 public Cliente buscarCliente(String cpf) {
		 return clientes.buscar(cpf);
	 }
	 
	 public void removerCliente(String cpf) throws ClienteNaoCadastradoException { 
		 clientes.remover(cpf);
	 }
	 
	 public void alterar (Cliente c) throws ClienteNaoCadastradoException { 
		 clientes.alterar(c);
	 }
	 
	 public void listarClientes() {
		 clientes.listar();
	 }
	 
	 public boolean existeTecnico(Tecnico tecnico) {
		 return tecnicos.existe(tecnico);
	 }
	 
	 public void cadastrarTecnico(Tecnico tecnico) {
		 tecnicos.cadastrar(tecnico);
	 }
	 
	 public boolean existeOrdem(Ordem os) throws OSExisteException {
		 return ordens.existe(os);
	 }
	 
	 public void cadastrarOrdem(Ordem os) throws OSExisteException, EquipamentoEmServicoException {
		 ordens.cadastrar(os);
	 }
	 
	 public Ordem buscarOrdem(String numero) throws OSNaoEncontradaException {
		return ordens.buscarOrdem(numero);
	}
	 
	 public void removerOS(String numero) {
		 ordens.removerOS(numero);
	}
	 
	public void listarOrdens() {
		ordens.listar();
	}
	
	public void cadastrarEquipamento(Equipamento e) throws EquipamentoExisteException {
		equipamentos.cadastrar(e);
	}
	
	public void removerEquipamento(String numero) throws EquipamentoExisteException, EquipamentoNaoExisteException { 
		equipamentos.remover(numero);
	}
	
	public void listarEquipamentos() { 
		equipamentos.listar();
	}
	
	public Equipamento buscarEquipamentos(String numero) throws EquipamentoNaoExisteException {
		return equipamentos.buscar(numero);
	}
	
	public void atualizarEquipamento(Equipamento equip) throws EquipamentoNaoExisteException { 
		equipamentos.atualizar(equip);
	}
	
	public void alterar(Ordem os, String tipo, Object o) throws OSExisteException, EquipamentoEmServicoException{
		ordens.alterar(os, tipo, o);
	}
 
	
}
