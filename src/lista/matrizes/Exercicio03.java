package lista.matrizes;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao
		 * usuário um menú de opções: (a) somar as duas matrizes (b) subtrair a primeira
		 * matriz da segunda (c) adicionar uma constante às duas matrizes (d) imprimir
		 * as matrizes.
		 * 
		 * Nas duas primeiras opções uma terceira matriz 3 x 3 deve ser criada. Na
		 * terceira opção o valor da constante deve ser lido e o resultado da adição da
		 * constante deve ser armazenado na propria matriz.
		 */

		Scanner sc = new Scanner(System.in);

		double[][] matA = new double[2][2];
		double[][] matB = new double[2][2];
		double[][] matAux = new double[2][2];
		char ch;

		for (int i = 0; i < matA.length; i++) {
			for (int j = 0; j < matA[i].length; j++) {
				matA[i][j] = sc.nextDouble();
			}
		}

		System.out.println();

		for (int i = 0; i < matB.length; i++) {
			for (int j = 0; j < matB[i].length; j++) {
				matB[i][j] = sc.nextDouble();
			}
		}

		do {

			System.out.println("(a) somar as duas matrizes");
			System.out.println("(b) subtrair a primeira da segunda");
			System.out.println("(c) adicionar uma constante às duas matrizes");
			System.out.println("(d) imprimir as matrizes");

			ch = sc.next().charAt(0);

			switch (ch) {
			case 'a':

				for (int i = 0; i < matAux.length; i++) {
					for (int j = 0; j < matAux[i].length; j++) {
						matAux[i][j] = matA[i][j] + matB[i][j];
					}
				}
				break;

			case 'b':

				for (int i = 0; i < matAux.length; i++) {
					for (int j = 0; j < matAux[i].length; j++) {
						matAux[i][j] = matB[i][j] - matA[i][j];
					}
				}
				break;

			case 'c':

				System.out.print("Constante(k)= ");
				double k;
				k = sc.nextDouble();

				for (int i = 0; i < matA.length; i++) {
					for (int j = 0; j < matA[i].length; j++) {
						matA[i][j] += k;
					}
				}
				for (int i = 0; i < matB.length; i++) {
					for (int j = 0; j < matB[i].length; j++) {
						matB[i][j] += k;
					}
				}
				break;

			case 'd':

				System.out.println("Matriz A: ");
				for (int i = 0; i < matA.length; i++) {
					for (int j = 0; j < matA[i].length; j++) {
						System.out.print(matA[i][j] + "\t");
					}
					System.out.println();
				}
				System.out.println("\nMatriz B: ");
				for (int i = 0; i < matB.length; i++) {
					for (int j = 0; j < matB[i].length; j++) {
						System.out.print(matB[i][j] + "\t");
					}
					System.out.println();
				}
				System.out.println("\nMatriz Aux: ");
				for (int i = 0; i < matAux.length; i++) {
					for (int j = 0; j < matAux[i].length; j++) {
						System.out.print(matAux[i][j] + "\t");
					}
					System.out.println();
				}
				break;

			default:
				System.out.println("Opção Inválida");
				break;
			}
			System.out.print("\nDeseja continuar (s/n)? ");
			ch = sc.next().charAt(0);

		} while (ch == 's');

		sc.close();
	}

}