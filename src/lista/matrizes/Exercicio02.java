package lista.matrizes;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		/*
		 * Faça programa que leia uma matriz 3 x 6 com valores reais. (a) Imprima a soma
		 * de todos os elementos das colunas ímpares. (b) Imprima a media aritmética dos
		 * elementos da segunda e quarta colunas. (c) Substitua os valores da sexta
		 * coluna pela soma dos valores das colunas 1 e 2. (d) Imprima a matriz
		 * modificada
		 */

		Scanner sc = new Scanner(System.in);

		double[][] mat = new double[3][6];
		double somaColImpar = 0;
		double somaColPar = 0;
		double media = 0;
		int cont = 0;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) { // a condição: "mat[i].length", pega o tamanho do array na posição
														// i, ou seja, na posição "i", o array tem o tamanho(length) "6".
				mat[i][j] = sc.nextDouble();

				if (j % 2 != 0) {
					somaColImpar += mat[i][j];
				} else {
					somaColPar += mat[i][j];
					cont++;
				}
			}
		}

		// (a)
		System.out.printf("Soma de todos os elementos das colunas ímpares: %.2f%n", somaColImpar);

		// (b)
		media = somaColPar / cont;
		System.out.printf("Media aritmética dos elementos da segunda e quarta colunas: %.2f%n", media);

		// (c)
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][5] = mat[i][0] + mat[i][1];
			}
		}

		// (d)
		for (int i = 0; i < mat.length; i++) {
			System.out.println();
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + "\t");
			}
		}
		sc.close();
	}
}