package br.ufrpe.assistec.beans;

public class Cliente extends Usuario {
	
	private Equipamento equipamento;
	private String endereco;
	private String cpf;
    
	public Cliente () {
		
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void setEquipamento (Equipamento equipamento) {
		this.equipamento = equipamento;
	}
	
	public String toString() {
		return super.toString() + "                 Equipamento" + "\n\n" + this.equipamento.toString();
	}

	
}
