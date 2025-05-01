/* 
LER OS DADOS DE UM TRABALHADOR COM N CONTRATOS (N FORNECIDO PELO USUÁRIO). DEPOIS, SOLICITAR DO USUÁRIO UM MÊS E MOSTRAR QUAL FOI O SALÁRIO DO FUNCIONÁRIO NESSE MÊS.
*/

package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.NivelTrabalhador;

public class Trabalhador {

	private String name;
	private NivelTrabalhador nivel;
	private Double salarioBase;
	
	//COMPOSIÇÃO DE OBJETOS
	//ASSOCIAÇÕES
	private Departamento departamento;
	private List<ContratoHora> listaContratos = new ArrayList<>();
	
	//CONSTRUTORES
	public Trabalhador() {
	}

	public Trabalhador(String name, NivelTrabalhador nivel, Double salarioBase, Departamento departamento) {
		this.name = name;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	//ENCAPSULAMENTO
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public NivelTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(NivelTrabalhador nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoHora> getListaContratos() {
		return listaContratos;
	}
	
	//METODOS
	public void adicionarContrato(ContratoHora contrato) {
		listaContratos.add(contrato);
	}
	
	public void removerContrato(ContratoHora contrato) {
		listaContratos.remove(contrato);
	}
	
	public double renda(int ano, int mes) {
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		for(ContratoHora c : listaContratos) {
			cal.setTime(c.getDate());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = cal.get(Calendar.MONTH);
			if(ano == c_ano && mes == c_mes) {
				soma += c.valorTotal();
			}
		}
		return soma;
	}
}
