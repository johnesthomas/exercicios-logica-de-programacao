package lista.condicionais;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		/*
		 * A CEF conceder� um cr�dito especial com juros de 2% aos seus clientes de
		 * acordo com o saldo m�dio no �ltimo ano. Fazer um algoritmo em JAVA que leia o
		 * saldo m�dio de um cliente e calcule o valor do cr�dito de acordo com a tabela
		 * a seguir. Imprimir uma mensagem informando o saldo m�dio e o valor de
		 * cr�dito.
		 */

		Scanner teclado = new Scanner(System.in);

		double saldoMedio, valorCredito = 0;
		String porcentagem = null;

		System.out.print("Digite seu saldo m�dio: ");
		saldoMedio = teclado.nextDouble();

		if (saldoMedio != 0) {

			if (saldoMedio > 0 && saldoMedio <= 500) {

				valorCredito = 0;
				porcentagem = "nenhum cr�dito.";

			} else if (saldoMedio >= 501 && saldoMedio <= 1000) {

				valorCredito = (saldoMedio * 0.3);
				porcentagem = "30% do valor do saldo m�dio.";

			} else if (saldoMedio >= 1001 && saldoMedio <= 3000) {

				valorCredito = (saldoMedio * 0.4);
				porcentagem = "40% do valor do saldo m�dio.";

			} else if (saldoMedio > 3000) {

				valorCredito = (saldoMedio * 0.5);
				porcentagem = "50% do valor do saldo m�dio.";

			}

			System.out.println("Valor informado de Saldo M�dio: " + saldoMedio);
			System.out.printf("Valor do Cr�dito � de: %.2f referente a %s", (valorCredito), (porcentagem));

		} else {

			System.out.println("Valor informado � inv�lido.");

		}
		teclado.close();
	}
}