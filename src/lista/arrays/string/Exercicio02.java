package lista.arrays.string;

public class Exercicio02 {

	public static void main(String[] args) {

		/*
		 * A partir de uma vari�vel String crie um algoritmo para validar (informe �data
		 * v�lida� ou �data inv�lida) uma data de nascimento no formato: DD/MM/AAAA. A
		 * data n�o pode ser maior que o dia atual.
		 */

		int[] dataAtual = { 13, 05, 2020 };
		int[] dataNasc = { 13, 05, 2020 };
		String situacao = null;
		boolean dia = false;
		boolean mes = false;
		boolean ano = false;

		for (int i = 0; i < dataAtual.length; i++) {
			for (int x = 0; x < dataNasc.length; x++) {

				if (dataNasc[x] > dataAtual[i]) {
					dia = dataNasc[0] > dataAtual[0];
					mes = dataNasc[1] > dataAtual[1];
					ano = dataNasc[2] > dataAtual[2];

				} else {

					situacao = "Data v�lida !";
				}
			}
			if (dia || mes || ano) {

				situacao = "Data inv�lida";

			}
		}
		System.out.println(situacao);

	}
}