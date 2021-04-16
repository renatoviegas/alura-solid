package br.com.alura.rh;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;
import br.com.alura.rh.service.reajuste.ReajusteService;

public class App {

	public static void main(String[] args) {
		Funcionario// funcionario.setDataUltimoReajuste(LocalDate.now().minusDays(70));

		ReajusteService reajuste = new ReajusteService();
		reajuste.reajustarSalarioDoFuncionario(funcionario, BigDecimal.valueOf(3000));
	}

}
