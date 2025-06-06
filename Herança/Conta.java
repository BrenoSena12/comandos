package entities;

public class Conta {

	// ATRIBUTOS
	private Integer numero;
	private String titular;
	protected Double saldo;
	
	// CONSTRUTORES
	public Conta() {
	}

	public Conta(Integer numero, String titular, Double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	// ENCAPSULAMENTO
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	// METODOS 
	public void sacar(double quantia) {
		saldo -= quantia;
	}
	
	public void deposito(double quantia) {
		saldo += quantia;
	}
}