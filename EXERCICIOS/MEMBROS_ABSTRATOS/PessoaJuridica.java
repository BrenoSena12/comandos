package entities;

public class PessoaJuridica extends Pessoa{

	// ATRIBUTOS
		private Integer numeroFuncionarios;
		
		// CONSTRUTORES
		public PessoaJuridica() {
			super();
		}

		public PessoaJuridica(String nome, double rendaAnual, Integer numeroFuncionarios) {
			super(nome, rendaAnual);
			this.numeroFuncionarios = numeroFuncionarios;
		}
		
		// ENCAPSULAMENTO
		public Integer numeroFuncionarios() {
			return numeroFuncionarios;
		}

		public void numeroFuncionarios(Integer numeroFuncionarios) {
			this.numeroFuncionarios = numeroFuncionarios;
		}
		
		// METODOS
		@Override
		public double totalImposto() {
			if(numeroFuncionarios <= 10) {
				return rendaAnual * 0.16;
			}else {
				return rendaAnual * 0.14;
			}
		}
}
