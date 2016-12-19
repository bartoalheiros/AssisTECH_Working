package br.ufrpe.assistec.ui;

import br.ufrpe.assistec.negocio.EquipamentoExisteException;
import br.ufrpe.assistec.negocio.EquipamentoNaoExisteException;
import br.ufrpe.assistec.negocio.ServidorAssisTech;
import br.ufrpe.assistec.negocio.beans.Equipamento;

public class TesteEquipamento {

	public static void main(String[] args) throws EquipamentoExisteException, EquipamentoNaoExisteException {
		ServidorAssisTech servidor = ServidorAssisTech.getInstance();
		
		Equipamento equip = new Equipamento("Máquina de Lavar", "98HX32189", "1257");
		Equipamento equip2 = new Equipamento("Computador Desktop HP", "98HX32182", "12792");
		Equipamento equip3 = new Equipamento("Notebook HP Pavillon", "L2J98421", "12793");
		
		try {
			servidor.cadastrarEquipamento(equip);
			servidor.cadastrarEquipamento(equip2);
			servidor.removerEquipamento("98HX32182");
		}catch(EquipamentoExisteException e) {
			System.err.println(e.getMessage());
			Equipamento equip4 = servidor.buscarEquipamentos(e.getNumSerie());
			System.out.println(equip4);
		}catch(EquipamentoNaoExisteException e2) {
			System.err.println(e2.getMessage());
		}
		
		
		//System.out.println(equip);
	}

}
