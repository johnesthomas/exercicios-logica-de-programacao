package lista.vetores;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		/*
		 * Fa�a um programa para ler 10 numeros DIFERENTES a serem armazenados em um
		 * vetor. Os dados dever�o ser armazenados no vetor na ordem que forem sendo
		 * lidos, sendo que caso o usuario digite um n�mero que j� foi digitado
		 * anteriormente, o programa dever� pedir para ele digitar outro n�mero. Note
		 * que cada valor digitado pelo usu�rio deve ser pesquisado no vetor,
		 * verificando se ele existe entre os numeros que j� foram fornecidos. Exibir na
		 * tela o vetor final que foi digitado.
		 */

		Scanner input = new Scanner(System.in);

		int[] numeros = new int[10];
		int n;
		boolean validacao = false;

		System.out.println("Digite 05 n�meros: ");

		for (int i = 0; i < numeros.length; i++) {

			if (i == 0) {

				n = input.nextInt();
				numeros[0] = n;

			} else {

				validacao = false;

				n = input.nextInt();

				for (int j = 0; j < numeros.length; j++) {

					if (n == numeros[j]) {

						System.out.println("Digite outro n�mero: ");
						validacao = true;
						i--;
						break;

					}

				}

				if (!validacao) {

					numeros[i] = n;

				}

			}

		}

		System.out.print("Vetor de numeros: ");
		for (int numero : numeros) {
			System.out.print(numero + "|");

		}
		input.close();

	}
}
