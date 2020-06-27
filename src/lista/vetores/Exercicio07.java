package lista.vetores;

public class Exercicio07 {

	public static void main(String[] args) {

		/*
		 * Faça um vetor de tamanho 50 preenchido com o seguinte valor: (i+ 5 ∗ i) % (i+
		 * 1), sendo i a posição do elemento no vetor. Em seguida imprima o vetor na
		 * tela.
		 */

		int[] v = new int[50];

		for (int i = 0; i < v.length; i++) {
			v[i] = (i + 5 * i) % (i + 1);
		}

		for (int i : v) {
			System.out.println(i);
		}
	}
}