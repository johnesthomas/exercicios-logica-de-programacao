package lista.arrays.string;

public class Exercicio05 {

	public static void main(String[] args) {

		/*
		 * A partir de uma vari�vel String que representa uma senha antiga (ex: �mundo�)
		 * verifique se uma nova senha tem ao menos 70% de diferen�a. De acordo com o
		 * teste informe �nova senha v�lida� ou �nova senha inv�lida�.
		 */

		String senhaAnt = "mundo";
		String senhaNova = "johness";
		String situacao = null;
		float porcPorLetra = (100 / senhaNova.length());
		int contador = 0;

		for (int i = 0; i < senhaAnt.length(); i++) {

			for (int x = 0; x < senhaNova.length(); x++) {

				if (senhaNova.charAt(x) == senhaAnt.charAt(i)) {

					contador++;

				}

			}

		}
		if ((porcPorLetra * contador) > 70) {

			situacao = "Nova Senha Inv�lida";

		} else {

			situacao = "Nova Senha V�lida";
		}
		System.out.println(situacao);
		System.out.println("Porcentagem de igualdade: " + porcPorLetra * contador + "%");
		System.out.println("Contador: " + contador + " letra(s) igual(is).");

	}

}
