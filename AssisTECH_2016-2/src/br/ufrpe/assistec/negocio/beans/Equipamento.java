package br.ufrpe.assistec.negocio.beans;

public class Equipamento {
    private String tipo;
    private String numeroSerie;
    private String numOS;
    
    public String getOs() {
		return numOS;
	}
	public void setOs(String os) {
		this.numOS = os;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNumeroSerie() {
		return numeroSerie;
	}
	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	
    public String toString() {
    	
    	String resultado = String.format("%7s %5s\n", "Numero de Série: ", this.numeroSerie);
    	resultado += String.format("%6s %5s\n", "Equipamento: ", this.tipo);
    	resultado += String.format("%4s %5s\n", "Os no: ", this.numOS);
    	
    	return resultado;
	}
    
    
    public static void main(String[] args) {
    	Equipamento e1 = new Equipamento();
    	Equipamento e2 = new Equipamento();
    	Equipamento e3 = new Equipamento();
    	
    	e1.setTipo("Guitarra");
    	e1.setNumeroSerie("Marshall 332");
    	e1.setOs("112");
    	
    	System.out.println(e1);
    }
}
