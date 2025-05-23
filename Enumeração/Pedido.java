package entities;

import java.util.Date;

import entities.enums.StatusPedido;

public class Pedido {

	// ATRIBUTOS
	private Integer id;
	private Date momento;
	private StatusPedido status;

	// CONSTRUTORES
	public Pedido() {
	}

	public Pedido(Integer id, Date momento, StatusPedido status) {
		this.id = id;
		this.momento = momento;
		this.status = status;
	}

	// ENCAPSULAMENTO
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	// METODOS
	@Override
	public String toString() {
		return "Pedido [id=" + id + ", momento=" + momento + ", status=" + status + "]";
	}

}
