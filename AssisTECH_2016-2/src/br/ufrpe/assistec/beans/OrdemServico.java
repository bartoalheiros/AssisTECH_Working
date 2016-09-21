package br.ufrpe.assistec.beans;

public class OrdemServico {

	private String numero;
	private Cliente cliente;
	private Equipamento equipamento;
	private String dataEntrada;
	private String dataEntrega;


	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Equipamento getEquipamento() {
		return this.equipamento;
	}

	public void setEquipto(Equipamento equipamento) {
		this.equipamento = equipamento;
	}

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

	public boolean equals(OrdemServico ordem) {
		boolean resultado = false;
		if(ordem.getNumero().equals(this.numero)) {
			resultado = true;
		}

		return resultado;
	}

	public String toString() {
		return "Número: " + "\n" + this.numero + "Data: " + this.dataEntrada + "\n" + this.cliente.toString() + "Equipamento: \n" + this.equipamento.toString();
	}
}
