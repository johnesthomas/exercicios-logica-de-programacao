package lista.condicionais;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		// Escreva um algoritmo em JAVA que leia um número e informe se ele é divisível
		// por 10, por 5 ou por 2 ou se não é divisível por nenhum deles.

		Scanner teclado = new Scanner(System.in);

		int numero;

		System.out.print("Digite um número: ");
		numero = teclado.nextInt();

		if (((numero % 10) == 0) && ((numero % 5) == 0) && ((numero % 2) == 0)) {

			System.out.println("Numero é divisivél por 10, 5 e 2");

		} else if ((numero % 10) == 0) {

			System.out.println("Numero é divisivél por 10");

		} else if ((numero % 5) == 0) {

			System.out.println("Numero é divisivél por 5");

		} else if ((numero % 2) == 0) {

			System.out.println("Numero é divisivél por 2");

		} else {

			System.out.println("O numero digitado não é divisivél por 10, 5 ou 2.");
		}
		teclado.close();
	}
}