package br.ufrpe.assistec.ui;

import java.util.Scanner;

import br.ufrpe.assistec.negocio.ClienteJahCadastradoException;
import br.ufrpe.assistec.negocio.ClienteNaoCadastradoException;
import br.ufrpe.assistec.negocio.OSExisteException;
import br.ufrpe.assistec.negocio.OSNaoEncontradaException;
import br.ufrpe.assistec.negocio.ServidorAssisTech;
import br.ufrpe.assistec.negocio.TecnicoNaoCadastradoException;
import br.ufrpe.assistec.negocio.beans.Cliente;
import br.ufrpe.assistec.negocio.beans.Tecnico;
import br.ufrpe.assistec.negocio.beans.Usuario;

public class Programa {
	
	public static void main(String[] args) throws OSNaoEncontradaException, OSExisteException, ClienteJahCadastradoException, ClienteNaoCadastradoException {
		Scanner input = new Scanner(System.in);
		String entrada = null;

		//MENU
		ServidorAssisTech servidor = ServidorAssisTech.getInstance();
		
		do{
			entrada = null; 
			System.out.println("Escolha a opcao desejada: \n\n");
			System.out.println("1 - Nova Ordem\n");
			System.out.println("2 - Cadastrar Cliente\n");
			System.out.println("3 - Buscar Cliente\n");
			System.out.println("4 - Cadastrar Técnico\n");
			System.out.println("5 - Buscar Técnico\n");
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


				case "1":
					
					
	
					
					
					break;
	
				case "2":
					String var = null;
					
					System.out.println("Digite o cpf do cliente: ");
					var = input.nextLine();
					input.nextLine(); //Limpa o buffer do teclado
					
					//Criando um cliente, utilizando o Construtor que tem como parâmetro a String cpf.
					Cliente cli = new Cliente(var);
					
					System.out.println("Digite o nome: ");
					var = input.nextLine();
					input.nextLine(); //Limpa o buffer do teclado
					
					cli.setNomeCompleto(var);
					
					System.out.println("Endereço: ");
					var = input.nextLine();
					input.nextLine(); //Limpa o buffer do teclado
					
					cli.setEndereco(var);
					
					System.out.println("Telefone: ");
					var = input.nextLine();
					input.nextLine(); //Limpa o buffer do teclado
					
					cli.setTelefone(var);
					
					System.out.println("E-mail: ");
					var = input.nextLine();
					input.nextLine(); //Limpa o buffer do teclado
					
					cli.setEmail(var);
					
					servidor.cadastrarCliente(cli);
					
					System.out.println("Cliente Cadastrado com Sucesso!");
					
					break;
	
				case "3":
					Cliente cli_2 = new Cliente();
					String cpf = null;
					
					System.out.println("Digite o cpf: ");
					cpf = input.nextLine();
					input.nextLine(); //Limpa o buffer do teclado
					
					try{
						cli_2 = servidor.buscarCliente(cpf);
						System.out.println(cli_2);
					}catch(ClienteNaoCadastradoException e1) {
						System.out.println(e1.getMessage());
					}
					
					break;
	
				case "4":
					String var2 = null;
					
					System.out.println("Digite o cpf do tecnico: ");
					var2 = input.nextLine();
					input.nextLine(); //Limpa o buffer do teclado
					
					//Criando um tecnico, utilizando o Construtor que tem como parâmetro a String matrícula.
					Usuario tec = new Tecnico(var2);
					
					System.out.println("Digite o nome: ");
					var2 = input.nextLine();
					input.nextLine(); //Limpa o buffer do teclado
					
					tec.setNomeCompleto(var2);
					
					System.out.println("Endereço: ");
					var2 = input.nextLine();
					input.nextLine(); //Limpa o buffer do teclado
					
					tec.setEndereco(var2);
					
					System.out.println("Telefone: ");
					var2 = input.nextLine();
					input.nextLine(); //Limpa o buffer do teclado
					
					tec.setTelefone(var2);
					
					System.out.println("E-mail: ");
					var2 = input.nextLine();
					input.nextLine(); //Limpa o buffer do teclado
					
					tec.setEmail(var2);
					
					servidor.cadastrarTecnico((Tecnico)tec);
					
					System.out.println("Tecnico Cadastrado com Sucesso!");
					
					break;
	
				case "5":
					Usuario tec_2 = new Tecnico();
					String cpf_2 = null;
					
					System.out.println("Digite a matrícula do Técnico procurado: ");
					cpf_2 = input.nextLine();
					input.nextLine(); //Limpa o buffer do teclado
					
					try{
						tec_2 = servidor.buscarTecnico(cpf_2);
						System.out.println(tec_2);
					}catch(TecnicoNaoCadastradoException e1) {
						System.out.println(e1.getMessage());
					}
					
					break;
	
				default: 
					System.out.println("Digite uma opção válida.");
	
			}	
		
		}while(entrada.equals("8") == false);

		System.out.println("Obrigado por utilizar AssisTec!"); 
        input.close();
	}


}


