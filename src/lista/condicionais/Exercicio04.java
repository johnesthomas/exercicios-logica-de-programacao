package lista.condicionais;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		/*
		 * Crie um algoritmo em JAVA que leia a idade de uma pessoa e informe a sua
		 * classe eleitoral: � n�o eleitor (abaixo de 16 anos); � eleitor obrigat�rio
		 * (entre a faixa de 18 e menor de 65 anos); � eleitor facultativo (de 16 at� 18
		 * anos e maior de 65 anos, inclusive).
		 */

		Scanner teclado = new Scanner(System.in);

		String situacao = null;
		int idade;

		System.out.print("Digite a idade: ");
		idade = teclado.nextInt();

		if (idade == 0 || idade < 16) {

			situacao = "N�o Eleitor";

		} else if (idade >= 18 && idade <= 65) {

			situacao = "Eleitor Obrigat�rio";

		} else if (idade == 16 || idade < 18 || idade > 65) {

			situacao = "Eleitor Facultativo";
		}

		teclado.close();
		System.out.println("Situa��o: " + situacao);

	}
}