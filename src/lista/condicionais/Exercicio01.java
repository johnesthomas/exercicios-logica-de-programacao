package lista.condicionais;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		// Escreva um algoritmo em JAVA que leia um n�mero e informe se ele � divis�vel
		// por 10, por 5 ou por 2 ou se n�o � divis�vel por nenhum deles.

		Scanner teclado = new Scanner(System.in);

		int numero;

		System.out.print("Digite um n�mero: ");
		numero = teclado.nextInt();

		if (((numero % 10) == 0) && ((numero % 5) == 0) && ((numero % 2) == 0)) {

			System.out.println("Numero � divisiv�l por 10, 5 e 2");

		} else if ((numero % 10) == 0) {

			System.out.println("Numero � divisiv�l por 10");

		} else if ((numero % 5) == 0) {

			System.out.println("Numero � divisiv�l por 5");

		} else if ((numero % 2) == 0) {

			System.out.println("Numero � divisiv�l por 2");

		} else {

			System.out.println("O numero digitado n�o � divisiv�l por 10, 5 ou 2.");
		}
		teclado.close();
	}
}