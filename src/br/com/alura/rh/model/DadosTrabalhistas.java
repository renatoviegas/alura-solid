package br.com.alura.rh.model;

import java.math.BigDecimal;

public class DadosTrabalhistas {

	private Cargo cargo;
	private BigDecimal salario;

	public DadosTrabalhistas(Cargo cargo, BigDecimal salario) {
		this.cargo = cargo;
		this.salario = salario;
	}

	public Cargo getCargo() {
		return cargo;
	}
	
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public BigDecimal getSalario() {
		return salario;
	}
	
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
}