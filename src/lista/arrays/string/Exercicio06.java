package lista.arrays.string;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		/*
		 * A partir de uma vari�vel String crie um algoritmo para validar um campo de
		 * hora atrav�s do seguinte formato: HH:MM:SS. As horas variam de 00 a 23.
		 * Informe �hora inv�lida� em caso de algum campo ultrapassar seu limite, isto �
		 * hora maior que 23, minuto e segundo maiores que 59. Caso contr�rio informe
		 * �hora v�lida�.
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

			System.out.println("\n\nHora Inv�lida");

		}

		else {

			System.out.println("\n\nHora V�lida");
		}

		teclado.close();

	}

}
