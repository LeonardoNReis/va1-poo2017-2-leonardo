package br.unincor.controle;

import java.util.ArrayList;
import java.util.List;

import br.unincor.exception.EvolucaoException;
import br.unincor.model.Pokemon;
import br.unincor.view.Usuario;

public class Main {

	public static void main(String[] args) {
		Operacoes op = new Operacoes();
		Usuario gui = new Usuario();
		Long qtdPokemons = gui.recebeLong("Digite a quantidade de Pokemons: ");
		List<Pokemon> listaPokemons = new ArrayList<Pokemon>();

		for (int i = 0; i < qtdPokemons; i++) {

			listaPokemons.add(new Pokemon("Pokemon " + i, String.valueOf(i), (double) (Math.random() * 1000),
					(double) (Math.random() * 180)));
		}

		for (int i = 0; i < listaPokemons.size(); i++) {
			try {
				op.evoluir(listaPokemons.get(i));
			} catch (EvolucaoException e) {
				// TODO Auto-generated catch block
				e.getMessage();
			}
		}

		gui.exibeMsg(op.maiorCp(listaPokemons).verDados());
		gui.exibeMsg(op.menorCp(listaPokemons).verDados());

	}

}
