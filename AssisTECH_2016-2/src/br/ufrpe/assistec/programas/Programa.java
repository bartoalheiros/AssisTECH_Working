package br.ufrpe.assistec.programas;

import java.util.Scanner;

import br.ufrpe.assistec.beans.Cliente;
import br.ufrpe.assistec.beans.OrdemServico;
import br.ufrpe.assistec.repositorios.RepositorioOrdensServico;

public class Programa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String entrada = null;

		//MENU
		RepositorioOrdensServico repositorioOS = new RepositorioOrdensServico(); 
		String codigo;

		do{
			entrada = null; 
			System.out.println("Escolha a opcao desejada: \n\n");
			System.out.println("1 - Cadastrar Ordem de Servico\n");
			System.out.println("2 - Listar Ordens de Servico em Aberto\n");
			System.out.println("3 - Listar Todas as Ordens de Servico\n");
			System.out.println("4 - Buscar Ordem de Servico\n");
			System.out.println("5 - Cadastrar Cliente\n");
			System.out.println("6 - Listar Clientes\n");
			System.out.println("7 - Buscar Cliente\n");
			System.out.println("8 - Sair\n\n");
			System.out.println("Opção: "); entrada = input.next(); 
			input.nextLine(); //Limpa o buffer do teclado
			//if(entrada.equals("5")){

			switch(entrada) {

			//instanciando um novo livro, preenchendo e guardando no repositórioLivros...  
			case "1":
				OrdemServico ordem = new OrdemServico();	
				System.out.println("Número: \n");
				String no = input.nextLine();
				input.nextLine(); //Limpa o buffer do teclado
				ordem.setNumero(no);;


				System.out.println("Abertura: \n");
				String data = input.nextLine();
				ordem.setDataEntrada(data);;
				input.nextLine(); //Limpa o buffer do teclado

				System.out.println("Portador: \n");
				String portador = input.nextLine();
				input.nextLine(); //Limpa o buffer do teclado
				ordem.setPortador(portador);
				
				Cliente cliente = new Cliente();
				
				
				
				repositorio.inserir(liv);
				break;

			case "2":
				System.out.println("Digite o código do livro que deseja remover: ");
				codigo = input.nextLine();
				boolean resultadoRemover = repositorio.removerLivro(codigo);
				if(resultadoRemover == false){
					System.out.println("Livro não existe.");
				}
				break;

			case "3":
				System.out.println("Digite o código do livro: ");
				codigo = input.nextLine();
				input.nextLine(); //Limpa o buffer do teclado
				liv = repositorio.buscar(codigo);
				if(liv != null) {
					System.out.println(liv);	   
				}else{
					System.out.println("Livro não existe!");	   
				}
				break;

			case "4":
				System.out.println("Digite o código do livro que deseja alterar: ");
				codigo = input.nextLine();
				repositorio.alterar(codigo);
				break;
			
			case "5":
				repositorio.listar();
				break;

			default: 
				System.out.println("Digite uma opção válida.");

			}	
			//} //else {

			//} 
		}while(entrada.equals("6") == false);

		System.out.println("Obrigado por utilizar nosso sistema de Livraria!"); 
        input.close();
	}


	}

}
