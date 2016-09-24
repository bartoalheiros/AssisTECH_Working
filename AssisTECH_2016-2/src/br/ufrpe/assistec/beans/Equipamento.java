package br.ufrpe.assistec.beans;

public class Equipamento {
    private String tipo;
    private String numeroSerie;
    private String caracteristicasDefeito;
    private String relatorioDeManutencao;
	
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
	
	public String getRelatorioDeManutencao() {
		return this.relatorioDeManutencao;
	}
	
	public void modificarRelatorioDeManutencao(String relatorioDeManutencao) {
		this.relatorioDeManutencao = this.relatorioDeManutencao + " " + relatorioDeManutencao; //concatena a String recebida de relatorio e acrescenta à antiga.
	}
    
	public String toString() {
		return "Tipo: " + this.tipo + "\n" + "Número de Série: " + this.numeroSerie + "\n" + "Relatório do Defeito: " + this.caracteristicasDefeito;
	}
    
}
