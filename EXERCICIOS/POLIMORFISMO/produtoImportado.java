package entities;

public class ProdutoImportado extends Produto{

	// ATRIBUTOS
	private Double taxaAlfandega;
	
	// CONSTRUTORES
	public ProdutoImportado() {
		super();
	}
	
	public ProdutoImportado(String nome, Double preco, Double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}
	
	// ENCAPSULAMENTO
	public Double getTaxaAlfandega() {
		return taxaAlfandega;
	}
	
	public void setTaxaAlfandega(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}
	
	// METODOS
	public Double precoTotal() {
		return preco + taxaAlfandega;
	}
	
	@Override
	public String etiquetaDePreco() {
		return nome
				+ " $"
				+ String.format("%.2f", precoTotal())
				+ " (Taxa de alfandega: $" + String.format("%.2f", taxaAlfandega)+ ")";
	}
}
