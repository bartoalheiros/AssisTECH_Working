package br.ufrpe.assistec.negocio.beans;

public class Usuario {
    private String nomeCompleto;
    private String email;
    private String telefone;
    private int numOrdens;
    
    public Usuario(String nomeCompleto, String email, String telefone, int numOrdens) {
    	this.nomeCompleto = nomeCompleto;
    	this.email = email;
    	this.telefone = telefone;
    	this.numOrdens = numOrdens;
    }
   
	public Usuario(){
    
    }
	
	public long getNumOrdens() {
		return numOrdens;
	}

	public void setNumOrdens(int numOrdens) {
		this.numOrdens = numOrdens;
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
    
    public void aumentarNumOrdens() {
    	this.numOrdens++;
    }
    
    public String toString() {
    	String resultado = String.format("%5s %5s\n", "Nome: ", this.nomeCompleto);
    	resultado += String.format("%6s %5s\n", "Email: ", this.email);
    	resultado += String.format("%7s %1s\n", "Telefone: ", this.telefone);
    	resultado += String.format("%5s %1s\n", "OS's: ", this.numOrdens);
    	
    	return resultado;
    }
    
    public static void main(String[] args) {
    	Usuario u1 = new Usuario("João da Silva Júnior", "joao@gmail.com", "3039-4572", 37);
    	
    	System.out.println(u1);

	}

}
