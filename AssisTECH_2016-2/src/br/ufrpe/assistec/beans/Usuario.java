package br.ufrpe.assistec.beans;

public class Usuario {
    private String nomeCompleto;
    private String email;
    private String telefone;
    
    public Usuario(){
    	
    }
    
    public String getNomeCompleto() {
    	return this.nomeCompleto;
    }
    
    public void setNomeCompleto(String nome) {
    	this.nomeCompleto = nome;
    }
    
    public String getEmail() {
    	return this.email;
    }
    
    public void setEmail(String email) {
    	this.email = email;
    }
    
    public String getTelefone() {
    	return this.telefone;
    }
    
    public void setTelefone ( String telefone ) {
    	this.telefone = telefone;
    }
    
    public String toString() {
    	return "Nome: " + this.nomeCompleto + "\n" + "Email: " + this.email + "\n" + "Telefone: " + this.telefone + "\n\n";
    }
}
