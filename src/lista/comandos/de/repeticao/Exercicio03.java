package lista.comandos.de.repeticao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		// Leia o nome do usuário e escreva o nome dele na tela 10 vezes.

		Scanner teclado = new Scanner(System.in);

		String nome;

		System.out.print("Digite seu nome: ");
		nome = teclado.nextLine();
		teclado.close();

		for (int i = 0; i < 10; i++) {

			System.out.println(nome);

		}

	}
}