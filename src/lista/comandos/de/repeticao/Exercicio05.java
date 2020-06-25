package lista.comandos.de.repeticao;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		// Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses
		// números.

		Scanner teclado = new Scanner(System.in);

		int numero, somaNumeros = 0;

		for (int i = 0; i < 10; i++) {

			System.out.print("Digite um numero: ");
			numero = teclado.nextInt();
			somaNumeros += numero;

		}
		teclado.close();
		System.out.print("A soma dos numeros são: " + somaNumeros);
	}
}