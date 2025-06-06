package entities;

public class ContaEmpresarial extends Conta{

	// ATRIBUTOS
	private Double limiteEmprestimo;
	
	// CONSTRUTORES
	public ContaEmpresarial() {	
		super(); 
	}

	public ContaEmpresarial(Integer numero, String titular, Double saldo, Double limiteEmprestimo) {
		super(numero, titular, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	// ENCAPSULAMENTO
	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	// METODOS
	public void emprestimo(double quantia) {
		if(quantia <= limiteEmprestimo) {
			saldo += quantia - 10.0;
		}
	}	
}