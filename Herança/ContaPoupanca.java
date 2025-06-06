package entities;

public class ContaPoupanca extends Conta{

	// ATRIBUTOS
	private Double taxaDeJuros;
	
	// CONSTRUTORES
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Integer numero, String titular, Double saldo, Double taxaDeJuros) {
		super(numero, titular, saldo);
		this.taxaDeJuros = taxaDeJuros;
	}

	// ENCAPSULAMENTO
	public Double getTaxaDeJuros() {
		return taxaDeJuros;
	}

	public void setTaxaDeJuros(Double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}
	
	// METODOS
	public void atualizarSaldo() {
		saldo += saldo * taxaDeJuros;
	}
	
	@Override 
	public void sacar(double quantia) {
		saldo -= quantia;
	}
}