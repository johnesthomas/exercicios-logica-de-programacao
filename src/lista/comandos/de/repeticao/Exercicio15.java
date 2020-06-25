package lista.comandos.de.repeticao;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		// Escreva um algoritmo que leia uma sequência de números do usuário e realize a
		// soma desses números. Encerre a execução quando um número negativo for
		// digitado.

		Scanner teclado = new Scanner(System.in);

		int somaNumeros = 0, valor = 0;

		do {
			System.out.print("Digite um valor:");

			valor = teclado.nextInt();

			if (valor > 0) {

				somaNumeros += valor;
			}

		} while (valor > 0);

		teclado.close();
		System.out.println("A soma dos numeros digitados foi: " + somaNumeros);

	}

}
