package lista.condicionais;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		/*
		 * Construa um algoritmo em JAVA que determine (imprima) se um dado número N
		 * inteiro (recebido através do teclado) é PAR ou ÍMPAR.
		 */

		Scanner teclado = new Scanner(System.in);

		int numero;

		System.out.println("Digite um numero: ");
		numero = teclado.nextInt();

		if (numero % 2 == 0) {

			System.out.println("Esse número é PAR.");

		} else {

			System.out.println("Esse número é ÍMPAR");

		}
		teclado.close();

	}

}
