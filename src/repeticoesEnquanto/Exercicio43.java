package repeticoesEnquanto;

import java.util.Scanner;

// Desenvolva um algoritmo que mostre uma contagem regressiva de 30 até 1, marcando os números que forem divisíveis por 4, exatamente como mostrado abaixo: 30 29 [28] 27 26 25 [24] 23 22 21 [20] 19 18 17 [16]

public class Exercicio43 {

	public int exercicio43(int contagem_exerc43) {

		Scanner input = new Scanner(System.in);

		System.out.println("Exercício 43 - Desenvolva um algoritmo que mostre uma contagem regressiva de 30 até 1, marcando os números que forem divisíveis por 4, exatamente como mostrado abaixo: 30 29 [28] 27 26 25 [24] 23 22 21 [20] 19 18 17 [16]\n");

		contagem_exerc43 = 31;

		int auxiliar_exerc43 = 0;

		while (contagem_exerc43 > 0) {

			contagem_exerc43 = contagem_exerc43 - 1;
			auxiliar_exerc43 = contagem_exerc43 % 4;
			
			if (auxiliar_exerc43 == 0) {

				System.out.printf("[%d] ", contagem_exerc43);

			} else {

				System.out.printf("%d ", contagem_exerc43);

			}

		}

		System.out.println(
				"\n\n====================================================================================================================\n");

		return 0;
	}
}