package br.com.alura.rh;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;
import br.com.alura.rh.service.ReajusteService;

public class App {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Joao das Can", "123456789-00", Cargo.ANALISTA, BigDecimal.valueOf(10000));

		funcionario.setDataUltimoReajuste(LocalDate.now().minusDays(70));

		ReajusteService reajuste = new ReajusteService();
		reajuste.reajustarSalarioDoFuncionario(funcionario, BigDecimal.valueOf(3000));
	}

}
