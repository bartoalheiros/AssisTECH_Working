package br.ufrpe.assistec.ui;

import br.ufrpe.assistec.negocio.EquipamentoJahEncaminhadoException;
import br.ufrpe.assistec.negocio.OSExistenteException;
import br.ufrpe.assistec.negocio.ServidorAssisTech;
import br.ufrpe.assistec.negocio.beans.Cliente;
import br.ufrpe.assistec.negocio.beans.Equipamento;
import br.ufrpe.assistec.negocio.beans.OrdemDeServico;
import br.ufrpe.assistec.negocio.beans.Tecnico;

import java.util.Scanner;

import br.ufrpe.assistec.dados.*;

public class Demo {

	public static void main(String[] args) throws OSNaoEncontradaException, EquipamentoJahEncaminhadoException, OSExistenteException {
		
		OrdemDeServico ordemServico = new OrdemDeServico();
		
		Cliente cli = new Cliente();
		Equipamento equipamento = new Equipamento();
		Tecnico tecnico = new Tecnico();
		
		ServidorAssisTech servidor = null;
		servidor = servidor.getInstance();
		
		ordemServico.setNumero("123456");
		ordemServico.setDataEntrada("24/09/2016");
		ordemServico.setPortador("Josias Miguel");
		
		//preenchendo cadastro de cliente
		cli.setNomeCompleto("José Padilha Almeida Caetano");
		cli.setEmail("josepad27@yahoo.com.br");
		cli.setTelefone("3437-4132");
		
		servidor.cadastrarCliente(cli);
		
		//Cadastro do equipamento
		equipamento.setTipo("Computador HP 200 G1 Slim Tower");
		equipamento.setNumeroSerie("LW430UA#ABA");
		
		//servidor.cadastrar
		
		//cadastrando técnico
		tecnico.setNomeCompleto("Cláudio Araújo");
		tecnico.setTelefone("3071-8763");
		tecnico.setEmail("tec_claudio@diginfo.com.br");
		
		
		ordemServico.setCliente(cli);
		ordemServico.setEquipamento(equipamento);
		ordemServico.setTecnicoResponsavel(tecnico);
		
		ordemServico.setCaracteristicasDefeito("Equipamento não liga. Luz Power não acende.");
		ordemServico.setRelatorioDeManutencao("Equipamento ainda não aberto por um técnico.");
		
		servidor.cadastrarOrdem(ordemServico);
		
		//servidor.listarOrdens();
		System.out.println("\n");
		
		OrdemDeServico os2 = null;
		Scanner input = new Scanner(System.in);
		
		/*try{
			os2 = servidor.buscarOrdem("123459");
			
		
		}catch(OSNaoEncontradaException osNEExcp){
			
			System.err.println(osNEExcp.getMessage());
			//String numOS = input.nextLine();
			//input.nextLine();//clear buffer
			
			
		}
		
		if(os2 != null) {
			System.out.println(os2);
		}*/
		
		try {
			os2 = new OrdemDeServico();
			Equipamento equip2 = new Equipamento();
			os2.setNumero("1234569");
			os2.setDataEntrada("24/09/2016");
			os2.setPortador("Josias Miguel");
			
			cli.setNomeCompleto("José Padilha Almeida Caetano");
			cli.setEmail("josepad27@yahoo.com.br");
			cli.setTelefone("3437-4132");
			
			//Cadastro do equipamento
			equip2.setTipo("Computador HP 200 G1 Slim Tower");
			equip2.setNumeroSerie("LW430UA#ABA");
			os2.setEquipamento(equip2);
			
			servidor.cadastrarOrdem(os2);
		} catch(OSExistenteException existeExcept) {
			System.err.println(existeExcept.getMessage());
		} catch(EquipamentoJahEncaminhadoException equipEmServico) {
			System.out.println("cheguei aqui");
			System.err.print(equipEmServico.getMessage());
		}
		
		//System.out.println(cliente);
		//ServidorAssisTech servidor = new ServidorAssisTech();
		
	}

}
