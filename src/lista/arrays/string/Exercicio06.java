package lista.arrays.string;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		/*
		 * A partir de uma variável String crie um algoritmo para validar um campo de
		 * hora através do seguinte formato: HH:MM:SS. As horas variam de 00 a 23.
		 * Informe “hora inválida” em caso de algum campo ultrapassar seu limite, isto é
		 * hora maior que 23, minuto e segundo maiores que 59. Caso contrário informe
		 * “hora válida”.
		 */

		Scanner teclado = new Scanner(System.in);

		int hora;
		int minuto;
		int segundo;
		boolean situacao = false;

		System.out.print("Informe a Hora: ");
		hora = teclado.nextInt();
		System.out.print(hora + ":");
		minuto = teclado.nextInt();
		System.out.print(hora + ":" + minuto + ":");
		segundo = teclado.nextInt();
		System.out.print(hora + ":" + minuto + ":" + segundo);

		if (hora > 23) {

			situacao = true;

		} else if (minuto > 59) {

			situacao = true;

		} else if (segundo > 59) {

			situacao = true;

		}

		if (situacao) {

			System.out.println("\n\nHora Inválida");

		}

		else {

			System.out.println("\n\nHora Válida");
		}

		teclado.close();

	}

}
