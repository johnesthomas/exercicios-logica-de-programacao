package lista.vetores;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		/*
		 * Considere um vetor A com 11 elementos onde A1 < A2 < · · · < A6 > A7 > A8 >
		 * ··· > A11, ou seja, esta ordenado em ordem crescente até o sexto elemento, e
		 * a partir desse elemento está ordenado em ordem decrescente. Dado o vetor da
		 * questão anterior, proponha um algoritmo para ordenar os elementos.
		 */

		Scanner sc = new Scanner(System.in);

		int[] A = new int[11];
		int[] dA = new int[6];

		int aux = 0;

		// preenchendo o vetor A
		System.out.println("Preencha o vetor A com 11 elementos: ");
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}

		// ordenando vetor A em ordem crescente
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length - 1; j++) {
				if (A[j] > A[j + 1]) {
					aux = A[j];
					A[j] = A[j + 1];
					A[j + 1] = aux;
				}
			}
		}
		// preenchendo o vetor dA a partir do sexto elemento do vetor A
		for (int i = 5; i < A.length; i++) {
			dA[i - 5] = A[i];
		}

		// ordenando vetor dA em ordem decrescente
		for (int i = 0; i < dA.length; i++) {
			for (int j = 0; j < dA.length - 1; j++) {
				if (dA[j] < dA[j + 1]) {
					aux = dA[j];
					dA[j] = dA[j + 1];
					dA[j + 1] = aux;
				}
			}

		}
		// imprimindo o vetor A até o quinto elemento
		for (int i : A) {
			if (i < 6) {
				System.out.print(i + "<");
			}
		}
		// imprimindo o vetor dA
		for (int i : dA) {
			if (i != 6) {
				System.out.print(i + ">");
			} else {
				System.out.print(i);
			}
		}
		sc.close();
	}
}