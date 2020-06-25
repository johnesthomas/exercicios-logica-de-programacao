package lista.condicionais;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		/*
		 * Construa um algoritmo de JAVA para determinar se o indiv�duo esta com um peso
		 * favor�vel. Essa situa��o � determinada atrav�s do IMC (�ndice de Massa
		 * Corp�rea), que � definida como sendo a rela��o entre o peso (PESO) e o
		 * quadrado da Altura (ALTURA) do indiv�duo. Ou seja, e, a situa��o do peso �
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
		// o "(float)" � para voltar a vari�vel imc como float
		// a fun��o Math.pow (n, exponecial) � igual a n^exponencial

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

		System.out.printf("Seu IMC �: %.2f", (imc));

		System.out.println("\nSua situa��o �: " + situacao);

	}

}
