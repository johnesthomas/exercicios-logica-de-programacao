package lista.arrays.string;

public class Exercicio03 {

	public static void main(String[] args) {

		/*
		 * Crie um algoritmo para verificar uma senha predefinida chamada “senha”. Crie
		 * um array de senhas (com tamanhos variáveis) e caso o número de tentativas
		 * exceda a 3 informe “senha bloqueada”.
		 */

		String senha = "senha3";
		String[] senhas = { "senha1", "senha2", "senha3", "senha4", "senha5" };
		String situacao = null;

		for (int i = 0; i < 3; i++) {

			if ((senha).equals(senhas[i])) {

				situacao = "Senha Correta";

			} else {

				situacao = "Senha bloqueada";
			}

		}
		System.out.println(situacao);

	}

}
