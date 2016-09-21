package br.ufrpe.assistec.programas;

import br.ufrpe.assistec.beans.Cliente;
import br.ufrpe.assistec.beans.Equipamento;

public class Programa {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Equipamento equipamento = new Equipamento();
		
		//preenchendo cadastro de cliente
		cliente.setNome("José Padilha Almeida Caetano");
		cliente.setEmail("josepad27@yahoo.com.br");
		cliente.setTelefone("3437-4132");
		
		
		
		cliente.setEquipamento(equipamento);
		System.out.println(cliente);

	}

}
