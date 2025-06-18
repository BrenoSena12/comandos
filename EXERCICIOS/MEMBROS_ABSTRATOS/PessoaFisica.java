package entities;

public class PessoaFisica extends Pessoa{

	// ATRIBUTOS
	private Double gastosSaude;
	
	// CONSTRUTORES
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}
	
	// ENCAPSULAMENTO
	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	// METODOS
	@Override
	public double totalImposto() {
		if(rendaAnual < 20000.0) {
			return  rendaAnual * 0.15 - (gastosSaude * 0.5);
		}else {
			return rendaAnual * 0.25 - (gastosSaude * 0.5);
		}
	}
}
