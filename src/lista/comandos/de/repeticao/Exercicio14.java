package lista.comandos.de.repeticao;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		// Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão
		// entre 0 e 100, quantos estão entre 101 e 200 e quantos são maiores de 200.

		Scanner teclado = new Scanner(System.in);

		int numero, contador1 = 0, contador2 = 0, contador3 = 0;

		for (int i = 1; i <= 5; i++) {

			System.out.print("Digite o " + i + "º numero: ");
			numero = teclado.nextInt();

			if (numero > 0 && numero < 100) {

				contador1++;
			}

			else if (numero > 101 && numero < 200) {

				contador2++;
			}

			else if (numero > 200) {

				contador3++;
			}
		}
		teclado.close();

		System.out.println("Existe(m) " + contador1 + " números entre 0 e 100, " + contador2 + " número(s) entre 101 e 200 e "
				+ contador3 + " número(s) maior(es) que 200");

	}
}
