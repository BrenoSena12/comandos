package entities;

public class FuncionarioTercerizado extends Funcionario{

	// ATRIBUTOS
	private Double custoAdicional;
	
	// Contrutores
	public FuncionarioTercerizado() {
		super();
	}

	public FuncionarioTercerizado(String nome, Integer horas, Double valorPorHora, Double custoAdicional) {
		super(nome, horas, valorPorHora);
		this.custoAdicional = custoAdicional;
	}

	// ENCAPSULAMENTO
	public Double getCustoAdicional() {
		return custoAdicional;
	}

	public void setCustoAdicional(Double custoAdicional) {
		this.custoAdicional = custoAdicional;
	}
	
	//METODOS
	
	@Override
	public Double pagamento() {
		return valorPorHora * horas + custoAdicional +(custoAdicional * 0.1);
	}

}
