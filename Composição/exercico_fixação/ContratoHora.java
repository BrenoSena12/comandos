package entities;

import java.util.Date;

public class ContratoHora {
	
	private Date date;
	private Double valorPorHora;
	private Integer horas;
	
	public ContratoHora() {
	}
	
	public ContratoHora(Date date, Double valorPorHora, Integer horas) {
		this.date = date;
		this.valorPorHora = valorPorHora;
		this.horas = horas;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public Integer getHours() {
		return horas;
	}

	public void setHours(Integer horas) {
		this.horas = horas;
	}
	
	//METODOS
	public double valorTotal() {
		return valorPorHora * horas;
	}
}
