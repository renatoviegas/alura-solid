package br.com.alura.rh.service.promocao;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class PromocaoService {

	public void promover(Funcionario funcionario, Boolean metaBatida) {
		Cargo cargoAtual = funcionario.getCargo();

		if (Cargo.GERENTE.equals(cargoAtual)) {
			throw new ValidacaoException("Gerente não pode ser promovido");
		}

		if (!metaBatida) {
			throw new ValidacaoException("Meta não foi alcançada: Promoção não pode ser realizada");
		}

		funcionario.promover(cargoAtual.proximoCargo());
	}

}