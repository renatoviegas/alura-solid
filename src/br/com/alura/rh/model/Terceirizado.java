package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Terceirizado extends PessoaFisica {

	private String empresa;
	private DadosTrabalhistas dadosTrabalhistas;
	
	public Terceirizado(String cpf, String nome, String empresa, Cargo cargo, BigDecimal salario) {		
		this.cpf = cpf;
		this.nome = nome;
		this.empresa = empresa;
		this.dadosTrabalhistas = new DadosTrabalhistas(cargo, salario);
	}
	
	public String getEmpresa() {
		return empresa;
	}
	
	public DadosTrabalhistas getDadosTrabalhistas() {
		return dadosTrabalhistas;
	}	
}
