package entities;

public class Produto {

	// ATRIBUTOS
	protected String nome;
	protected Double preco;
	
	// CONTSTRUTORES
	public Produto() {
	}

	public Produto(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	// ENCAPSULAMENTO
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	// METODOS
	
	public String etiquetaDePreco() {
		return nome 
				+ " $"
				+ String.format("%.2f", preco);
	}
}
