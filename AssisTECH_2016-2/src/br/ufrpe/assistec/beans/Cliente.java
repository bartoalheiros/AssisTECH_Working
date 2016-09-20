package br.ufrpe.assistec.beans;

public class Cliente extends Usuario {
	
	private Equipamento equipamento;
	private String endereco;
    
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String toString() {
		return super.toString() + "Equipamento: " + this.equipamento;
	}

	
}
