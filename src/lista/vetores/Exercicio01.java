package lista.vetores;

public class Exercicio01 {

	public static void main(String[] args) {

//		Fa�a um programa que possua um vetor denominado A que armazene 6 numeros inteiros. O programa deve executar os seguintes passos:
//			(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
//			(b) Armazene em uma variavel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
//			(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100.
//			(d) Mostre na tela cada valor do vetor A, um em cada linha.

		int[] A = { 1, 0, 5, -2, -5, 7 };
		int soma = 0;

		soma = A[0] + A[1] + A[5];
		System.out.println("A soma dos n�meros da posi��o A[0] + A[1] + A[5] �: " + soma);

		A[4] = 100;

		System.out.print("Novo vetor A: ");
		for (int a : A) {

			System.out.print(a + "|");
		}

	}

}
