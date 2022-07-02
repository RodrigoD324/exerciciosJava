package repeticoesEnquanto;

import java.util.Scanner;

// O programa acima vai ter um problema quando digitarmos o primeiro valor maior que o último. Resolva esse problema com um código que funcione em qualquer situação.

public class Exercicio45 {

	public int exercicio45(int valorInicial_exerc45, int valorFinal_exerc45, int incremento_exerc45) {

		Scanner input = new Scanner(System.in);

		System.out.printf("Exercício 45 - O programa acima vai ter um problema quando digitarmos o primeiro valor maior que o último. Resolva esse problema com um código que funcione em qualquer situação.\n\n");

		System.out.println("Insira valor inicial da contagem: ");
		valorInicial_exerc45 = input.nextInt();
		System.out.println("Insira valor final da contagem: ");
		valorFinal_exerc45 = input.nextInt();
		System.out.println("Insira incremento da contagem: ");
		incremento_exerc45 = input.nextInt();

		if (valorInicial_exerc45 < valorFinal_exerc45) {

			System.out.printf("Contagem: ");
			
			while (valorInicial_exerc45 < valorFinal_exerc45) {

				System.out.printf("%d ", valorInicial_exerc45);
				valorInicial_exerc45 = valorInicial_exerc45 + incremento_exerc45;

			}
			
			System.out.printf("Acabou!");

		} else {

			System.out.printf("\nMENSAGEM DE ERRO: VALOR INICIAL MAIOR QUE VALOR FINAL");

		}

		System.out.printf("\n\n====================================================================================================================\n");

		return 0;
	}
}