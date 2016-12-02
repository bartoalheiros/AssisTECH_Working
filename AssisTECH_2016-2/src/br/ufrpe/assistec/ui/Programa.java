package br.ufrpe.assistec.ui;

import java.util.Scanner;

import br.ufrpe.assistec.dados.OSNaoEncontradaException;
import br.ufrpe.assistec.negocio.EquipamentoJahEncaminhadoException;
import br.ufrpe.assistec.negocio.OSExistenteException;
import br.ufrpe.assistec.negocio.ServidorAssisTech;
import br.ufrpe.assistec.negocio.beans.Cliente;
import br.ufrpe.assistec.negocio.beans.Equipamento;
import br.ufrpe.assistec.negocio.beans.OrdemDeServico;
import br.ufrpe.assistec.negocio.beans.Tecnico;

public class Programa {
	
	public static void main(String[] args) throws OSNaoEncontradaException, OSExistenteException, EquipamentoJahEncaminhadoException {
		Scanner input = new Scanner(System.in);
		String entrada = null;

		//MENU
		ServidorAssisTech servidor = null;
		servidor = servidor.getInstance();
		
		do{
			entrada = null; 
			System.out.println("Escolha a opcao desejada: \n\n");
			System.out.println("1 - Cadastrar Ordem de Servico\n");
			System.out.println("2 - Listar Ordens de Servico Cadastradas(Resumo)\n");
			System.out.println("3 - Listar Ordens de Servico Cadastradas(Por data/prioridade)\n");
			//System.out.println("4 - Visualizar uma Ordem de Servico\n");
			//System.out.println("4 - Fechar Ordem de Servico\n");
			//System.out.println("5 - Cadastrar Cliente\n");
			//System.out.println("6 - Listar Clientes\n");
			//System.out.println("7 - Buscar Cliente\n");
			System.out.println("8 - Sair\n\n");
			System.out.println("Opção: "); entrada = input.next(); 
			input.nextLine(); //Limpa o buffer do teclado
			//if(entrada.equals("5")){

			switch(entrada) {

			//instanciando um novo livro, preenchendo e guardando no repositórioLivros...  
			case "1":
				//Dados iniciais
				try{
					OrdemDeServico ordem = new OrdemDeServico();
					System.out.println("Número: \n");
					String no = input.nextLine();
					input.nextLine(); //Limpa o buffer do teclado
					ordem.setNumero(no);
				}
				


				System.out.println("Data de Entrada: \n");
				String data = input.nextLine();
				ordem.setDataEntrada(data);
				input.nextLine(); //Limpa o buffer do teclado

				System.out.println("Portador: \n");
				String portador = input.nextLine();
				input.nextLine(); //Limpa o buffer do teclado
				ordem.setPortador(portador);
				
				//"Cadastrando" o Cliente
				Cliente cliente = new Cliente();
				System.out.printf("Dados do Cliente\n\n");
				
				System.out.println("Nome: ");
				String nome = input.nextLine();
				input.nextLine(); //Limpa o buffer do teclado
				cliente.setNomeCompleto(nome);
				
				System.out.println("Email: ");
				String email = input.nextLine();
				input.nextLine(); //Limpa o buffer do teclado
				cliente.setEmail(email);
				
				System.out.println("Telefone: ");
				String telefone = input.nextLine();
				cliente.setTelefone(telefone);
				ordem.setCliente(cliente);
				input.nextLine(); //Limpa o buffer do teclado
				
				//Cadastrando Equipamento
				Equipamento equipto = new Equipamento();
				System.out.printf("Dados do equipamento\n\n");
				
				System.out.println("Tipo: ");
				String tipo = input.nextLine();
				input.nextLine(); //Limpa o buffer do teclado
				equipto.setTipo(tipo);
				
				boolean check = false;
				
				do{
					try{

						//Cadastro do equipamento
						
						
						System.out.println("No de Série: ");
						String numSerie = input.nextLine();
						input.nextLine(); //Limpa o buffer do teclado

						check = servidor.validarEquipamento(numSerie);
						equipto.setNumeroSerie(numSerie);
						ordem.setEquipamento(equipto);

					} catch(EquipamentoJahEncaminhadoException equipEmServico) {

						System.out.println("cheguei aqui");
						System.err.print(equipEmServico.getMessage());

					}
				}while(check == true);
			
				//Fim do cadastro do equipamento, continuando a construir a ordem
				
				System.out.println("Características do Defeito: ");
				String caracDefeito = input.nextLine();
				input.nextLine(); //Limpa o buffer do teclado
				ordem.setCaracteristicasDefeito(caracDefeito);
				
				//Cadastrando Técnico
				Tecnico tecnico = new Tecnico();
				System.out.printf("Informações do Técnico\n\n");
				
				System.out.println("Nome Completo: ");
				String nomeTecnico = input.nextLine();
				input.nextLine(); //Limpa o buffer do teclado
			    tecnico.setNomeCompleto(nomeTecnico);
			    
			    System.out.println("Email: ");
			    String emailTecnico = input.nextLine();
			    input.nextLine(); //Limpa o buffer do teclado
			    tecnico.setEmail(emailTecnico);
			    
			    System.out.println("Telefone: ");
			    String telefoneTecnico = input.nextLine();
			    input.nextLine(); //Limpa o buffer do teclado
			    tecnico.setTelefone(telefoneTecnico);
			    
			    ordem.setTecnicoResponsavel(tecnico);
			    
			    System.out.println("Relatório de Manutenção: ");
				String relatorio = input.nextLine();
				input.nextLine(); //Limpa o buffer do teclado
				ordem.setRelatorioDeManutencao(relatorio);
				
				//repositorioOS.cadastrar(ordem);
				servidor.cadastrarOrdem(ordem);
				break;

			case "2":
				OrdemDeServico ordem_2 = new OrdemDeServico();
			    System.out.println("Digite o número da Ordem de Servico: ");
				String numeroOS = input.nextLine();
				input.nextLine(); //Limpa o buffer do teclado
				ordem_2 = servidor.buscarOrdem(numeroOS);
				if(ordem_2 != null) {
					System.out.println(ordem_2);	   
				}else{
					System.out.println("Ordem de Servico procurada não existe!");	   
				}
				break;

			case "3":
				servidor.listarOrdens();
				break;

			case "4":
				System.out.println("Digite o número da OS que deseja fechar: ");
				String numeroOS_2 = input.nextLine();
				input.nextLine(); //Limpa o buffer do teclado
				//repositorioOS.remover(numeroOS_2);
				servidor.removerOS(numeroOS_2);
				break;
			
			/*case "5":
				repositorio.listar();
				break;*/

			default: 
				System.out.println("Digite uma opção válida.");

			}	
			//} //else {

			//} 
		}while(entrada.equals("8") == false);

		System.out.println("Obrigado por utilizar AssisTec!"); 
        input.close();
	}


	}

//}
