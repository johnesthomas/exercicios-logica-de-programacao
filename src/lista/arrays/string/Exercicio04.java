package lista.arrays.string;

public class Exercicio04 {

	public static void main(String[] args) {

		/*
		 * A partir de uma variável String crie um algoritmo para validar (informe “nome
		 * válido” ou “nome inválido) um nome de pessoa através das seguintes regras: ●
		 * o nome precisa obrigatoriamente ter no mínimo três partes: primeiro, meio e
		 * último nome; ● o nome não deve conter números ● cada nome deve possuir no
		 * mínimo 3 caracteres
		 */

		String nome = "Johnes Thomas Correia Silva";
		String numeros = "0123456789";
		String situacao = null;

		String[] nomeArray = nome.split(" ");

		boolean partes = false;
		boolean contNum = false;
		boolean minChar = false;

		for (int i = 0; i < nomeArray.length; i++) {

			if (nomeArray[i].length() < 3) {

				minChar = true;
				break;

			}
			for (int x = 0; x < nomeArray[i].length(); x++) {

				for (int y = 0; y < numeros.length(); y++) {

					if (nomeArray[i].charAt(x) == numeros.charAt(y)) {

						contNum = true;
						break;

					}
				}

			}
			if (nomeArray.length < 3) {

				partes = true;
				break;

			}
		}
		if (partes || contNum || minChar) {

			situacao = "Nome Inválido!";

		} else {

			situacao = "Nome Válido!";
		}

		System.out.println(situacao);

	}

}
