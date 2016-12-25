package br.ufrpe.assistec.ui;

import br.ufrpe.assistec.negocio.ServidorAssisTech;
import br.ufrpe.assistec.negocio.beans.Cliente;

public class TesteCliente {

	public static void main(String[] args) {
		ServidorAssisTech servidor = ServidorAssisTech.getInstance();
		
		Cliente c1 = new Cliente("049100127-09", "Rua Augusta, 701, São Paulo - SP");
		Cliente c2 = new Cliente("049100127-09", "Rua Desembargador Vieira Neves, 1204, Recife - PE");
		
		
	}

}
