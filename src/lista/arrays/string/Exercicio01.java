package lista.arrays.string;

public class Exercicio01 {

	public static void main(String[] args) {

		/*
		 * 1) A partir de uma variável String crie um algoritmo para validar (informe
		 * “senha válida” ou “senha inválida) uma senha através das seguintes
		 * definições: ● a senha precisa ter, pelo menos, um número; ● a senha precisa
		 * ter, pelo menos, uma vogal; ● a senha precisa ter no mínimo 6 e no máximo 10
		 * caracteres
		 */

		String senha = "j2ohnes01";
		String situacao = null;
		String numeros = "0123456789";
		String vogais = "aeiou";
		boolean temNumero = false;
		boolean temVogal = false;

		if (senha.length() >= 6 && senha.length() <= 10) {

			for (int i = 0; i < senha.length(); i++) {

				for (int x = 0; x < numeros.length(); x++) {

					if (senha.charAt(i) == numeros.charAt(x)) {

						temNumero = true;
						break;
					}

				}
				for (int x = 0; x < vogais.length(); x++) {

					if (senha.charAt(i) == vogais.charAt(x)) {

						temVogal = true;
						break;

					}

				}
			}

			if (temNumero && temVogal) {

				situacao = "Senha Válida";

			}

			else {

				situacao = "Senha Inválida";
			}

		} else {

			situacao = "Senha Inválida";

		}
		System.out.println(situacao);

	}
}
