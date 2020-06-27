package lista.vetores;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		/*
		 * Ler dois conjuntos de números reais, armazenando-os em vetores e calcular o
		 * produto escalar entre eles. Os conjuntos tem 5 elementos cada. Imprimir os
		 * dois conjuntos e o produto escalar, sendo que o produto escalar é dado por:
		 */

		Scanner input = new Scanner(System.in);

		float[] u = new float[5];
		float[] v = new float[5];
		float produtoEscalar = 0f;

		System.out.println("Digite 05 número para o vetor u: ");
		for (int i = 0; i < v.length; i++) {
			u[i] = input.nextInt();
		}
		System.out.println("Digite 05 número para o vetor v: ");
		for (int i = 0; i < v.length; i++) {
			v[i] = input.nextInt();

		}
		for (int i = 0; i < v.length; i++) {

			produtoEscalar += (u[i]) * (v[i]);

		}
		System.out.print("Vetor u: ");
		for (float vetorU : u) {
			System.out.print(vetorU + "|");
		}
		System.out.print("\nVetor v: ");
		for (float vetorV : v) {
			System.out.print(vetorV + "|");
		}
		System.out.println("\nProduto escalar: " + produtoEscalar);

		input.close();
	}

}
