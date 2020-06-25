package lista.condicionais;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		/*
		 * Dados três valores A, B e C, construa um algoritmo em JAVA, que imprima os
		 * valores de forma descendente (do maior para o menor).
		 */

		Scanner teclado = new Scanner(System.in);

		int[] numeros = new int[4];

		for (int i = 1; i < numeros.length; i++) {

			System.out.print("Digite o " + i + "º número: ");
			numeros[i] = teclado.nextInt();

		}
		teclado.close();
		Arrays.sort(numeros);

		System.out.print("\nNúmeros em ordem crescente: ");
		for (int i = 1; i < numeros.length; i++) {

			System.out.print(numeros[i] + " ");
		}
	}
}
