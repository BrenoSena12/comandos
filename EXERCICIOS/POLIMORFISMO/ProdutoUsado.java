package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	// ATRIBUTOS
	private Date dataFabricacao;
	
	
	// CONSTRUTORES
	public ProdutoUsado() {
		super();
	}

	public ProdutoUsado(String nome, Double preco, Date dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}

	// ENCAPUSULAMENTO
	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	// METODOS
	@Override
	public String etiquetaDePreco() {
		return nome
				+ " (usado) $"
				+ String.format("%.2f", preco)
				+ " (data de fabricação: " + sdf.format(dataFabricacao) +")";
	} 
}