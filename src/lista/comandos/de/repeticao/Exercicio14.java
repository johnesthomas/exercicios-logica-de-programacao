package lista.comandos.de.repeticao;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		// Fa�a um algoritmo que leia 20 n�meros e, ao final, escreva quantos est�o
		// entre 0 e 100, quantos est�o entre 101 e 200 e quantos s�o maiores de 200.

		Scanner teclado = new Scanner(System.in);

		int numero, contador1 = 0, contador2 = 0, contador3 = 0;

		for (int i = 1; i <= 5; i++) {

			System.out.print("Digite o " + i + "� numero: ");
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

		System.out.println("Existe(m) " + contador1 + " n�meros entre 0 e 100, " + contador2 + " n�mero(s) entre 101 e 200 e "
				+ contador3 + " n�mero(s) maior(es) que 200");

	}
}
