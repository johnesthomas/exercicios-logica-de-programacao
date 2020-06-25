package lista.arrays.string;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		/*
		 * A partir de uma variável String crie um algoritmo para validar um número de
		 * telefone no seguinte formato 9XXXX-YYYY. Caso o número informado tenha 8
		 * dígitos e não inicie com os dígitos 3 ou 4, inclua o dígito 9. Caso o
		 * telefone informado seja válido exiba o número com o DDD 81, por exemplo (081)
		 * 99999-9999, do contrário informe “telefone inválido”.
		 */

		Scanner teclado = new Scanner(System.in);

		String DDD = "(081)";
		String numeroStr = null;
		String numeroFinal = null;
		String numeros = "349";

		int numero;

		System.out.print("Digite um numero: ");
		numero = teclado.nextInt();

		numeroStr = String.valueOf(numero);

		if (numeroStr.length() == 8
				&& (numeroStr.charAt(0) != numeros.charAt(0) && numeroStr.charAt(0) != numeros.charAt(1))) {

			numeroFinal = "9" + numeroStr;

			System.out.println(numeroFinal);

		} else if (numeroStr.length() == 9 && numeroStr.charAt(0) == numeros.charAt(2)) {

			System.out.println(DDD + " " + numeroStr);

		} else {

			System.out.println("Telefone Inválido");
		}

		teclado.close();

	}

}
