package lista.comandos.de.repeticao;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		// Crie um algoritmo leia um número do usuário e exiba a sua tabuada de
		// multiplicação.

		Scanner teclado = new Scanner(System.in);

		int taboada[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int numero = 0, valor = 0;

		System.out.print("Digite um numero: ");
		numero = teclado.nextInt();

		if (numero != 0) {

			for (int i = 0; i < taboada.length; i++) {

				valor = (numero * taboada[i]);
				System.out.println(taboada[i] + " x " + numero + " = " + valor);

			}
		} else {
			System.out.println("Todo numero multiplicado por 0 é 0.");
		}
		teclado.close();
	}

}
