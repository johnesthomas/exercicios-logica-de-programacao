package lista.comandos.de.repeticao;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		// Leia a idade de 20 pessoas e exiba a m�dia das idades.

		Scanner teclado = new Scanner(System.in);

		int idade, somaIdades = 0, mediaIdades;

		for (int i = 0; i < 20; i++) {

			System.out.print("Digite sua idade: ");
			idade = teclado.nextInt();
			somaIdades += idade;

		}
		mediaIdades = (somaIdades / 20);
		teclado.close();
		System.out.print("A m�dia das idades s�o: " + mediaIdades);

	}
}
