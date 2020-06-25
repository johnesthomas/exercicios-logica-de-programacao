package lista.comandos.de.repeticao;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		// Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade.

		Scanner teclado = new Scanner(System.in);

		int idade;
		int contaMaiores = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite a idade da " + (i + 1) + " pessoas");
			idade = teclado.nextInt();

			if (idade >= 18) {

				contaMaiores++;
			}

		}
		teclado.close();
		System.out.println("Foram encontrados: " + contaMaiores + " pessoas maiores de idade");

	}

}
