package lista.comandos.de.repeticao;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		// Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão
		// entre 0 e 100.

		Scanner teclado = new Scanner(System.in);

		int numero, contador = 0;

		for (int i = 1; i <= 20; i++) {

			System.out.print("Digite o " + i + "º numero: ");
			numero = teclado.nextInt();

			if (numero > 0 && numero < 100) {

				contador++;
			}

		}
		teclado.close();
		System.out.println("Existe(m) " + contador + " números entre 0 e 100.");
	}
}