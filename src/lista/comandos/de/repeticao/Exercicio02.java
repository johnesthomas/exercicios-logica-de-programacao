package lista.comandos.de.repeticao;

public class Exercicio02 {

	public static void main(String[] args) {

		// Escreva um algoritmo que calcule a soma dos números de 1 a 15.

		int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		int somaNumeros = 0;

		for (int i = 0; i < numeros.length; i++) {

			System.out.println("Numeros: " + numeros[i]);
			somaNumeros += numeros[i];

		}
		System.out.println("A soma dos números de 1 até 15 é: " + somaNumeros);

	}
}
