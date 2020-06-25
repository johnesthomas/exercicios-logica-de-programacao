package lista.condicionais;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		/*
		 * Construa um algoritmo de JAVA para determinar se o indivíduo esta com um peso
		 * favorável. Essa situação é determinada através do IMC (Índice de Massa
		 * Corpórea), que é definida como sendo a relação entre o peso (PESO) e o
		 * quadrado da Altura (ALTURA) do indivíduo. Ou seja, e, a situação do peso é
		 * determinada pela tabela abaixo:
		 */

		Scanner teclado = new Scanner(System.in);

		int peso;
		float altura, imc;
		String situacao = null;

		System.out.println("*PROGRAMA PARA CALCULAR IMC*");

		System.out.print("DIGITE O SEU PESO: ");
		peso = teclado.nextInt();

		System.out.print("DIGITE SUA ALTURA: ");
		altura = teclado.nextFloat();

		imc = (int) (peso / Math.pow(altura, 2));
		// o "(float)" é para voltar a variável imc como float
		// a função Math.pow (n, exponecial) é igual a n^exponencial

		teclado.close();

		if (imc < 20) {
			situacao = "Abaixo do peso";

		} else if ((imc >= 20) && (imc < 25)) {
			situacao = "Peso normal";

		} else if ((imc >= 25) && (imc < 30)) {
			situacao = "Sobre peso";

		} else if ((imc >= 30) && (imc < 40)) {
			situacao = "Obeso";
		}

		System.out.printf("Seu IMC é: %.2f", (imc));

		System.out.println("\nSua situação é: " + situacao);

	}

}
