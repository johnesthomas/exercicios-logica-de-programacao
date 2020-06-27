package lista.vetores;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		/*
		 * Leia 10 numeros inteiros e armazene em um vetor v. Crie dois novos vetores v1
		 * e v2. Copie os valores �mpares de v para v1, e os valores pares de v para v2.
		 * Note que cada um dos vetores v1 e v2 tem no m�ximo 10 elementos, mas nem
		 * todos os elementos s�o utilizados. No final escreva os elementos UTILIZADOS
		 * de v1 e v2.
		 */

		Scanner input = new Scanner(System.in);

		int[] v = new int[10];
		int v1[] = new int[v.length]; // vetor �mpar
		int v2[] = new int[v.length]; // vetor par

		System.out.println("Digite 10 n�mero inteiros: ");

		for (int i = 0; i < v.length; i++) {
			v[i] = input.nextInt();

			if (v[i] % 2 == 0) {

				v2[i] = v[i];

			} else {

				v1[i] = v[i];

			}

		}
		System.out.print("N�mero(s) par(es): ");
		for (int par : v2) {

			if (par != 0) {

				System.out.print(par + "|");
			}

		}
		System.out.print("\nN�mero(s) �mpar(es): ");
		for (int impar : v1) {

			if (impar != 0) {

				System.out.print(impar + "|");

			}
		}
		input.close();

	}
}
