package lista.vetores;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que calcule o desvio padr�o de um vetor v contendo n = 10
		 * numeros, onde m e a media do vetor.
		 */

		Scanner input = new Scanner(System.in);

		int[] v = new int[5];
		int soma = 0;
		float media;
		float somaVariancia = 0;
		float variancia;
		float desvioPadrao;

		// receber os 10 n�meros
		System.out.println("Digite 10 n�meros: ");
		for (int i = 0; i < v.length; i++) {
			v[i] = input.nextInt();
		}

		// somar todos os numeros do vetor
		for (int i = 0; i < v.length; i++) {
			soma += v[i];
		}

		// m�dia dos n�meros do vetor
		media = (float) (soma / v.length);

		// somar todos os elementos ao quadrado
		for (int i = 0; i < v.length; i++) {
			somaVariancia += (float) Math.pow((v[i] - media), 2);
		}

		// soma dos elementos dividido pela quantidade de elementos no vetor
		variancia = (somaVariancia / v.length);

		// resultado final: Desvio Padr�o
		desvioPadrao = (float) Math.sqrt(variancia);

		System.out.printf("Desvio padr�o �: %.2f", (desvioPadrao));

		input.close();

	}

}
