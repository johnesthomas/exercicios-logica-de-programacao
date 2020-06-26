package lista.condicionais;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		/*
		 * Criar um algoritmo em JAVA que informe a quantidade total de calorias de uma
		 * refeição a partir do usuário que deverá informar o prato, a sobremesa e a
		 * bebida (veja a tabela a seguir).
		 * 
		 * Sugestão: enumere cada opção de prato, sobremesa e bebida. Ou seja: Prato: 1
		 * - vegetariano, 2 – Peixe, 3 – Frango, 4 – Carne; Sobremesa: 1 – Abacaxi, 2 –
		 * Sorvete diet, 3 – Mouse diet, 4 – Mouse chocolate; Bebida: 1 – Chá, 2 - Suco
		 * de laranja, 3 – Suco de melão, 4 – Refrigerante diet.
		 */

		System.out.println(
				"***********************************************CARDÁPIO***********************************************");
		System.out.println(
				"******************************************************************************************************");
		System.out.println(
				"*    Prato      | Calorias ||        Sobremesa        | Calorias ||         Bebidas        | Calorias*");
		System.out.println(
				"* 1- Vetariano  |  180 cal || 1- Abacaxi              |  75 cal  || 1- Chá                 |  20  cal*");
		System.out.println(
				"* 2- Peixe      |  230 cal || 2- Sorvete diet         |  110 cal || 2- Suco de laranja     |  70  cal*");
		System.out.println(
				"* 3- Frango     |  250 cal || 3- Mouse diet           |  170 cal || 3- Suco de melão       |  100 cal*");
		System.out.println(
				"* 4- Carne      |  350 cal || 4- Mouse chocolate      |  200 cal || 4- Refrigerante diet   |  65  cal*");
		System.out.println(
				"******************************************************************************************************");

		Scanner sc = new Scanner(System.in);

		int n = 0;
		int caloriaTotal = 0;

		for (int i = 1; i <= 3; i++) {

			if (i == 1) {
				System.out.print("Prato: ");
			} else if (i == 2) {
				System.out.print("Sobremesa: ");
			} else {
				System.out.print("Bebida: ");
			}

			n = sc.nextInt();

			switch (n) {
			case 1:

				if (i == 1) {
					caloriaTotal += 180;
				} else if (i == 2) {
					caloriaTotal += 75;
				} else {
					caloriaTotal += 20;
				}

				break;

			case 2:

				if (i == 1) {
					caloriaTotal += 230;
				} else if (i == 2) {
					caloriaTotal += 110;
				} else {
					caloriaTotal += 70;
				}

				break;

			case 3:

				if (i == 1) {
					caloriaTotal += 250;
				} else if (i == 2) {
					caloriaTotal += 170;
				} else {
					caloriaTotal += 100;
				}

				break;

			case 4:

				if (i == 1) {
					caloriaTotal += 350;
				} else if (i == 2) {
					caloriaTotal += 200;
				} else {
					caloriaTotal += 65;
				}

				break;

			default:
				break;
			}
		}

		System.out.println("Calorias Total: " + caloriaTotal + " cal");

		sc.close();
	}

}
