package lista.condicionais;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		/*
		 * A CEF concederá um crédito especial com juros de 2% aos seus clientes de
		 * acordo com o saldo médio no último ano. Fazer um algoritmo em JAVA que leia o
		 * saldo médio de um cliente e calcule o valor do crédito de acordo com a tabela
		 * a seguir. Imprimir uma mensagem informando o saldo médio e o valor de
		 * crédito.
		 */

		Scanner teclado = new Scanner(System.in);

		double saldoMedio, valorCredito = 0;
		String porcentagem = null;

		System.out.print("Digite seu saldo médio: ");
		saldoMedio = teclado.nextDouble();

		if (saldoMedio != 0) {

			if (saldoMedio > 0 && saldoMedio <= 500) {

				valorCredito = 0;
				porcentagem = "nenhum crédito.";

			} else if (saldoMedio >= 501 && saldoMedio <= 1000) {

				valorCredito = (saldoMedio * 0.3);
				porcentagem = "30% do valor do saldo médio.";

			} else if (saldoMedio >= 1001 && saldoMedio <= 3000) {

				valorCredito = (saldoMedio * 0.4);
				porcentagem = "40% do valor do saldo médio.";

			} else if (saldoMedio > 3000) {

				valorCredito = (saldoMedio * 0.5);
				porcentagem = "50% do valor do saldo médio.";

			}

			System.out.println("Valor informado de Saldo Médio: " + saldoMedio);
			System.out.printf("Valor do Crédito é de: %.2f referente a %s", (valorCredito), (porcentagem));

		} else {

			System.out.println("Valor informado é inválido.");

		}
		teclado.close();
	}
}