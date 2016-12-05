package br.ufrpe.assistec.ui;

import br.ufrpe.assistec.negocio.EquipamentoEmServicoException;
import br.ufrpe.assistec.negocio.OSExisteException;
import br.ufrpe.assistec.negocio.ServidorAssisTech;
import br.ufrpe.assistec.negocio.beans.Cliente;
import br.ufrpe.assistec.negocio.beans.Equipamento;
import br.ufrpe.assistec.negocio.beans.OrdemDeServico;
import br.ufrpe.assistec.negocio.beans.Tecnico;

import java.util.Scanner;

import br.ufrpe.assistec.dados.*;

public class Demo {

	public static void main(String[] args) throws OSNaoEncontradaException, EquipamentoEmServicoException, OSExisteException {
		
		OrdemDeServico os = new OrdemDeServico();
		
		Cliente cli = new Cliente();
		Equipamento equipamento = new Equipamento();
		Tecnico tecnico = new Tecnico();
		
		ServidorAssisTech servidor = null;
		servidor = servidor.getInstance();
		
		os.setNumero("123456");
		os.setDataEntrada("24/09/2016");
		os.setPortador("Josias Miguel");
		
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
		
		
		os.setCliente(cli);
		os.setEquipamento(equipamento);
		os.setTecnicoResponsavel(tecnico);
		
		os.setCaracteristicasDefeito("Equipamento não liga. Luz Power não acende.");
		os.setRelatorioDeManutencao("Equipamento ainda não aberto por um técnico.");
		
		servidor.cadastrarOrdem(os);
		
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
		
		Equipamento equip2 = new Equipamento();
		os2 = new OrdemDeServico();
		
		try {
			
			os2.setNumero("1234567");
			os2.setDataEntrada("24/09/2016");
			os2.setPortador("Josias Miguel");
			
			cli.setNomeCompleto("José Padilha Almeida Caetano");
			cli.setEmail("josepad27@yahoo.com.br");
			cli.setTelefone("3437-4132");
			
			equip2.setTipo("Computador HP 200 G1 Slim Tower");
			servidor.validarEquipamento("LW430UA#ABA");
			equip2.setNumeroSerie("LW430UA#ABA");
			os2.setEquipamento(equip2);
			
			servidor.cadastrarOrdem(os2);
			
		} catch(OSExisteException existeExcept) {
			
			System.err.println(existeExcept.getMessage());
			
		} catch(EquipamentoEmServicoException equipEmServico) {
			
			System.out.println("cheguei aqui");
			System.err.print(equipEmServico.getMessage());
		
		}
	
				
		
		try{ 
			servidor.procurarEquipamento("LW430UA#ABA");
			
		} catch(EquipamentoEmServicoException equipEmServico) {
			
			System.out.println("techo 2");
			System.err.print(equipEmServico.getMessage());
		}
		//System.out.println(cliente);
		//ServidorAssisTech servidor = new ServidorAssisTech();
		
	}

}
