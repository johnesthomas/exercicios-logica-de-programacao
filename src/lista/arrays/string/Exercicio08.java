package lista.arrays.string;

public class Exercicio08 {

	public static void main(String[] args) {

		/*
		 * A partir de uma variável String crie um algoritmo para validar um e-mail
		 * através do seguinte padrão: texto com no mínimo 3 caracteres
		 * 
		 * @ texto com no mínimo 3 caracteres . ‘com’ ou ‘com.br’ caso o texto não siga
		 * este padrão informe: “e-mail inválido”, caso contrário informe: “e-mail
		 * cadastrado com sucesso”. Utilize os assuntos abordados sobre arrays e
		 * Strings.
		 */

		String email = "johnes@thomas.com.br";

		if (!(email.contains("@"))) {

			System.out.println("Email inválido");

		} else {

			String[] emailPart1 = email.split("@");
			// System.out.println(emailPart1[0]); // imprime a primeira parte do email antes
			// do @

			int secParte = emailPart1[1].indexOf(".");

			String emailParte2 = emailPart1[1].substring(0, secParte);
			// System.out.println(emailParte2); // imprime a segunda parte do email depois
			// do @ e depois do "."

			String caracter = emailPart1[1].substring(secParte);
			// System.out.println(caracter); // imprime a terceira parte do email ".com" ou
			// ".com.br"

			boolean situacao = false;
			String dotcom = ".com";
			String dotcomdotbr = ".com.br";

			if (emailPart1[0].length() < 3) {

				situacao = true;

			} else if (emailParte2.length() < 3) {

				situacao = true;

			} else if ((!((caracter.equals(dotcom)) || (caracter.equals(dotcomdotbr))))) {

				situacao = true;

			}

			if (situacao) {

				System.out.println("E-mail inválido");

			} else {

				System.out.println("E-mail cadastrado com sucesso");
			}
		}
	}

}
