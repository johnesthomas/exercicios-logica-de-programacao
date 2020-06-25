package lista.comandos.de.repeticao;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		// Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova.

		Scanner teclado1 = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);

		String nome, nomeMenor = null;
		int idade, menorIdade = 0;

		for (int i = 1; i <= 10; i++) {

			System.out.println("Digite o nome da " + i + "º pessoa:");
			nome = teclado1.nextLine();

			System.out.println("Digite a idade da " + i + "º pessoa:");
			idade = teclado2.nextInt();

			if (i == 1) {

				menorIdade = idade;

			}

			if (idade < menorIdade) {

				menorIdade = idade;
				nomeMenor = nome;

			} else if (idade == menorIdade && i != 1) {

				menorIdade = idade;
				nomeMenor = nomeMenor + ", " + nome;

			} else if (idade == menorIdade) {

				menorIdade = idade;
				nomeMenor = nome;

			}

		}
		teclado1.close();
		teclado2.close();

		System.out.println("A(s) pessoa(s) com menor idade é(são): " + nomeMenor + " com " + menorIdade + " anos.");

	}
}