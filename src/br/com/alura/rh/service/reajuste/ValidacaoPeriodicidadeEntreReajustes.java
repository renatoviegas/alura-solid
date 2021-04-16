package br.com.alura.rh.service.reajuste;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

public class ValidacaoPeriodicidadeEntreReajustes implements ValidacaoReajuste {

	private static final int SEIS_MESES = 6;

	public void validar(Funcionario funcionario, BigDecimal aumento) {
		if (ultimoReajusteFoiMenorQueSeisMeses(funcionario.getDataUltimoReajuste())) {
			throw new ValidacaoException("Intervalo entre reajustes deve ser de no mínimo 6 meses!");
		}
	}

	private boolean ultimoReajusteFoiMenorQueSeisMeses(LocalDate dataUltimoReajuste) {
		LocalDate dataAtual = LocalDate.now();
		long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
		return mesesDesdeUltimoReajuste < SEIS_MESES;
	}
}