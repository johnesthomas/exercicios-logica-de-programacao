package lista.comandos.de.repeticao;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		// Escreva um algoritmo que leia 20 n�meros do usu�rio e exiba quantos n�meros
		// s�o pares

		Scanner teclado = new Scanner(System.in);

		int numero, contador = 0;

		for (int i = 1; i <= 20; i++) {

			System.out.print("Digite o " + i + "� numero: ");
			numero = teclado.nextInt();

			if ((numero % 2) == 0) {

				contador++;

			}
		}
		teclado.close();
		System.out.println("Existe(m) " + contador + " n�meros que �(s�o) par(es).");
	}
}