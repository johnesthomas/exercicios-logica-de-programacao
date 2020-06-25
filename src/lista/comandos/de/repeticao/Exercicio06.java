package lista.comandos.de.repeticao;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		// Leia a idade de 20 pessoas e exiba a soma das idades.

		Scanner teclado = new Scanner(System.in);

		int idade, somaIdades = 0;

		for (int i = 0; i < 20; i++) {

			System.out.print("Digite sua idade: ");
			idade = teclado.nextInt();
			somaIdades += idade;

		}
		teclado.close();
		System.out.print("A soma das idades são: " + somaIdades);

	}
}