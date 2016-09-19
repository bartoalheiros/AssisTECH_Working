package br.ufrpe.assistec.beans;

public class OrdemServico {
    private Cliente cliente;
    private Equipamento equipto;
    private String dataEntrada;
    private String dataEntrega;
    private String horarioEntrada;
    
    public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Equipamento getEquipto() {
		return equipto;
	}

	public void setEquipto(Equipamento equipto) {
		this.equipto = equipto;
	}

	private String horarioEntrega;
    
	public String getDataEntrada() {
		return dataEntrada;
	}
	
	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	
	public String getDataEntrega() {
		return dataEntrega;
	}
	
	public void setDataEntrega(String dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	
	public String getHorarioEntrada() {
		return horarioEntrada;
	}
	
	public void setHorarioEntrada(String horarioEntrada) {
		this.horarioEntrada = horarioEntrada;
	}
	
	public String getHorarioEntrega() {
		return horarioEntrega;
	}
	
	public void setHorarioEntrega(String horarioEntrega) {
		this.horarioEntrega = horarioEntrega;
	}
}
