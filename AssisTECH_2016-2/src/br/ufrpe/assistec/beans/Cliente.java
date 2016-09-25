package br.ufrpe.assistec.beans;

public class Cliente extends Usuario {
	
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
	
	public String toString() {
		return "                 Cliente" + "\n\n" + super.toString();
	}

	
}
