package lista.comandos.de.repeticao;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		// Escreva um algoritmo que leia 20 n�meros do usu�rio e exiba quantos n�meros
		// s�o maiores do que 8.

		Scanner teclado = new Scanner(System.in);

		int numero, contador = 0;

		for (int i = 1; i <= 20; i++) {

			System.out.print("Digite o " + i + "� numero: ");
			numero = teclado.nextInt();

			if (numero > 8) {

				contador++;
			}

		}
		teclado.close();
		System.out.println("Existe(m) " + contador + " numero(s) maior que 8.");

	}
}