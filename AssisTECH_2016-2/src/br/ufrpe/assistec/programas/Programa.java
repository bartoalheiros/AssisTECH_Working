package br.ufrpe.assistec.programas;

import br.ufrpe.assistec.beans.Cliente;
import br.ufrpe.assistec.beans.Equipamento;
import br.ufrpe.assistec.beans.OrdemServico;

public class Programa {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Equipamento equipamento = new Equipamento();
		OrdemServico ordemServico = new OrdemServico();
		
		//preenchendo cadastro de cliente
		cliente.setNome("José Padilha Almeida Caetano");
		cliente.setEmail("josepad27@yahoo.com.br");
		cliente.setTelefone("3437-4132");
		
		equipamento.setTipo("Computador HP 200 G1 Slim Tower");
		equipamento.setNumeroSerie("LW430UA#ABA");
		
		
		
		
		cliente.setEquipamento(equipamento);
		System.out.println(cliente);

	}

}
