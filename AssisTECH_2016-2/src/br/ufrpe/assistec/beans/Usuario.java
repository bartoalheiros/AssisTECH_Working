package br.ufrpe.assistec.beans;

public class Usuario {
    private String nome;
    private String email;
    private String telefone;
    
    public Usuario(){
    	
    }
    
    public String getNome() {
    	return this.nome;
    }
    
    public void setNome(String nome) {
    	this.nome = nome;
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
    	return "Nome: " + this.nome + "\n" + "Email: " + this.email + "\n" + "Telefone: " + this.telefone;
    }
}
