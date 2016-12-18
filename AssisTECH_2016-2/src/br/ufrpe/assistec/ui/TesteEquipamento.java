package br.ufrpe.assistec.ui;

import br.ufrpe.assistec.negocio.beans.Equipamento;

public class TesteEquipamento {

	public static void main(String[] args) {
		Equipamento equip = new Equipamento("Máquina de Lavar", "98HX32189", "1257");
		
		
		System.out.println(equip);
	}

}
