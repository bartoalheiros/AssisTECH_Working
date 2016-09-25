package br.ufrpe.assistec.programas;

import br.ufrpe.assistec.beans.Cliente;
import br.ufrpe.assistec.beans.Equipamento;
import br.ufrpe.assistec.beans.OrdemServico;
import br.ufrpe.assistec.beans.Tecnico;
import br.ufrpe.assistec.repositorios.RepositorioOrdensServico;

public class Demo {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Equipamento equipamento = new Equipamento();
		OrdemServico ordemServico = new OrdemServico();
		Tecnico tecnico = new Tecnico();
		RepositorioOrdensServico repositorioOS = new RepositorioOrdensServico();
		
		//preenchendo cadastro de cliente
		cliente.setNomeCompleto("José Padilha Almeida Caetano");
		cliente.setEmail("josepad27@yahoo.com.br");
		cliente.setTelefone("3437-4132");
		
		equipamento.setTipo("Computador HP 200 G1 Slim Tower");
		equipamento.setNumeroSerie("LW430UA#ABA");
		
		tecnico.setNomeCompleto("Cláudio Araújo");
		tecnico.setTelefone("3071-8763");
		tecnico.setEmail("tec_claudio@diginfo.com.br");
		
		
		ordemServico.setCliente(cliente);
		ordemServico.setEquipamento(equipamento);
		ordemServico.setTecnicoResponsavel(tecnico);
		ordemServico.setNumero("123456");
		ordemServico.setDataEntrada("24/09/2016");
		ordemServico.setPortador("Josias Miguel");
		ordemServico.setCaracteristicasDefeito("Equipamento não liga. Luz Power não acende.");
		ordemServico.setRelatorioDeManutencao("Equipamento ainda não aberto por um técnico.");
		
		System.out.println(ordemServico);
		
		//System.out.println(cliente);

	}

}
