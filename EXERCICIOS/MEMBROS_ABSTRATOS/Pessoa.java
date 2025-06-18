package entities;

public abstract class Pessoa {

	// ATRIBUTOS
	private String nome;
	protected Double rendaAnual;
	
	// CONSTRUTORES
	public Pessoa() {
	}
	
	public Pessoa(String nome, double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}
	
	// ENCAPSULAMENTO
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	// METODOS
	public abstract double totalImposto();
}
