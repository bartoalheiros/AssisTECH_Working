package br.ufrpe.assistec.negocio.beans;

public class Equipamento {
    private String tipo;
    private String numeroSerie;
    
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
		return "Tipo: " + this.tipo + "\n" + "Número de Série: " + this.numeroSerie;
	}
    
}
