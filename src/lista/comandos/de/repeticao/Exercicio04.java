package lista.comandos.de.repeticao;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		// Leia o nome um n�mero do usu�rio um n�mero N e escreva o nome dele na tela N
		// vezes.

		Scanner teclado = new Scanner(System.in);

		String nome;
		int numero;

		System.out.print("Digite seu nome: ");
		nome = teclado.nextLine();
		System.out.println("Quantas vezes quer que apare�a seu nome ?");
		numero = teclado.nextInt();
		teclado.close();

		for (int i = 0; i < numero; i++) {

			System.out.println(nome);

		}

	}

}
