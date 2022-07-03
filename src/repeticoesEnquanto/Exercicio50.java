package repeticoesEnquanto;

import java.util.Scanner;

// Desenvolva um programa que faça o sorteio de 20 números entre 0 e 10 e mostre na tela

public class Exercicio50 {
	
	public Double exercicio50(double contagem_exerc50) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.printf("Exercício 50 - Desenvolva um programa que faça o sorteio de 20 números entre 0 e 10 e mostre na tela.\n\n");
		
		int acimaDe5_exerc50 = 0;
		int auxiliarDivisivel_exerc50 = 0;
		int divisivelPor3_exerc50 = 0;
		
		while (contagem_exerc50 < 10) {
			
			contagem_exerc50 = contagem_exerc50 + 0.5;
			System.out.printf("%.1f  ", contagem_exerc50);
			auxiliarDivisivel_exerc50 = (int) (contagem_exerc50 % 3);
			
			if (contagem_exerc50 > 5) {
				
				acimaDe5_exerc50++;
				
			}
			
			if (auxiliarDivisivel_exerc50 == 0) {
				
				divisivelPor3_exerc50++;
				
			}
			
		}
		
		System.out.printf("\n\n%d números estão acima de 5 na sequência acima.\n", acimaDe5_exerc50);
		System.out.printf("%d números são divisíveis por 3 na sequência acima.", divisivelPor3_exerc50);
		
		System.out.printf("\n\n====================================================================================================================\n");
		
		return null;
	}
}