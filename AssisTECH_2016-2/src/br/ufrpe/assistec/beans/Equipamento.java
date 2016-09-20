package br.ufrpe.assistec.beans;

public class Equipamento {
    private String tipo;
    private String numeroSerie;
    private String caracteristicasDefeito;
	
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
	public String getCaracteristicasDefeito() {
		return caracteristicasDefeito;
	}
	public void setCaracteristicasDefeito(String caracteristicasDefeito) {
		this.caracteristicasDefeito = caracteristicasDefeito;
	}
    
	public String toString() {
		return "Tipo: " + this.tipo + "Número de Série: " + this.numeroSerie + "Relatório do Defeito: " + this.caracteristicasDefeito;
	}
    
}
