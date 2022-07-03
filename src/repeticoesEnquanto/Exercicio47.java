package repeticoesEnquanto;

import java.util.Scanner;

//Desenvolva um aplicativo que mostre na tela o resultado da expressão 500 + 450 + 400 + 350 + 300 + ... + 50 + 0

public class Exercicio47 {

	public int exercicio47 (int contagem_exerc47) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.printf("Exercício 47 - Desenvolva um aplicativo que mostre na tela o resultado da expressão 500 + 450 + 400 + 350 + 300 + ... + 50 + 0.\n\n");
		
		System.out.printf("Insira número inteiro '500' --> ");
		contagem_exerc47 = input.nextInt();
		int auxiliar_exerc47 = 0;
		
		while (contagem_exerc47 >= 0) {
			
			if (contagem_exerc47 == 0) {
				
				auxiliar_exerc47 += contagem_exerc47;
				System.out.printf("%d.", contagem_exerc47);
				contagem_exerc47 = contagem_exerc47 - 50;
				
			} else {

				auxiliar_exerc47 += contagem_exerc47;
				System.out.printf("%d + ", contagem_exerc47);
				contagem_exerc47 = contagem_exerc47 - 50;
				
			}
			
		}
		
		System.out.printf("\n\nResultado da soma: %d", auxiliar_exerc47);

		System.out.printf("\n\n====================================================================================================================\n");
		
		return 0;
	}
}