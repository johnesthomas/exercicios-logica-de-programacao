package lista.condicionais;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		/*
		 * Criar um algoritmo em JAVA que leia o um n�mero inteiro entre 1 e 7 e escreva
		 * o dia da semana correspondente. Caso o usu�rio digite um n�mero fora desse
		 * intervalo, dever� aparecer uma mensagem informando que n�o existe dia da
		 * semana com esse n�mero.
		 */

		Scanner teclado = new Scanner(System.in);

		String diaExtenso = null;
		int diaNumero;

		System.out.print("Digite o numero de um dia: ");
		diaNumero = teclado.nextInt();

		if (diaNumero >= 1 && diaNumero <= 7) {

			if (diaNumero == 1) {

				diaExtenso = "Domingo";

			} else if (diaNumero == 2) {

				diaExtenso = "Segunda-Feira";

			} else if (diaNumero == 3) {

				diaExtenso = "Ter�a-Feira";

			} else if (diaNumero == 4) {

				diaExtenso = "Quarta-Feira";

			} else if (diaNumero == 5) {

				diaExtenso = "Quinta-Feira";

			} else if (diaNumero == 6) {

				diaExtenso = "Sexta-Feira";

			} else if (diaNumero == 7) {

				diaExtenso = "S�bado";

			}

			teclado.close();
			System.out.println("O n�mero informado corresponde a: " + diaExtenso);

		} else {

			System.out.println("N�o existe dia da semana com esse n�mero.");

		}

	}

}
