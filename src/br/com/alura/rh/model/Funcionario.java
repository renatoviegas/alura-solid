package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario extends PessoaFisica {

	private DadosTrabalhistas dadosTrabalhistas;
	private LocalDate dataUltimoReajuste;

	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.dadosTrabalhistas = new DadosTrabalhistas(cargo, salario);
	}

	public void atualizarSalario(BigDecimal novoSalario) {
		this.dadosTrabalhistas.setSalario(novoSalario);
		this.dataUltimoReajuste = LocalDate.now();
	}

	public Cargo getCargo() {
		return dadosTrabalhistas.getCargo();
	}

	public BigDecimal getSalario() {
		return dadosTrabalhistas.getSalario();
	}

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void promover(Cargo proximoCargo) {
		this.dadosTrabalhistas.setCargo(proximoCargo);		
	}	
}