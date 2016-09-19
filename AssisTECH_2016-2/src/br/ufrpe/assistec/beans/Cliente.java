package br.ufrpe.assistec.beans;

public class Cliente extends Usuario {
	
	private Equipamento equipamento;
	
	public String toString() {
		return super.toString() + "Equipamento: " + this.equipamento;
	}

	
}
