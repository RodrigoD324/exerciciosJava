package repeticoesEnquanto;

import java.util.Scanner;

// Crie um programa que calcule e mostre na tela o resultado da soma entre 6 + 8 + 10 + 12 + 14 + ... + 98 + 100.

public class Exercicio46 {
	
	public int exercicio46(int contagem_exerc46) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.printf("Exercício 46 - Crie um programa que calcule e mostre na tela o resultado da soma entre 6 + 8 + 10 + 12 + 14 + ... + 98 + 100.\n\n");
		
		System.out.printf("Pressione tecla '6' --> ");
		contagem_exerc46 = input.nextInt();
		int auxiliar_exerc46 = 0;
		
		while (contagem_exerc46 <= 100) {
			
			if (contagem_exerc46 == 100) {
				
				auxiliar_exerc46 += contagem_exerc46;
				System.out.printf("%d.", contagem_exerc46);
				contagem_exerc46 = contagem_exerc46 + 2;
				
			} else {
				
				auxiliar_exerc46 += contagem_exerc46;
				System.out.printf("%d + ", contagem_exerc46);
				contagem_exerc46 = contagem_exerc46 + 2;
				
			}
				
		}
		
		System.out.printf("\n\nResultado da soma: %d", auxiliar_exerc46);
		
		System.out.printf("\n\n====================================================================================================================\n");
		
		return 0;
	}
}