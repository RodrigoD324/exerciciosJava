package repeticoesEnquanto;

import java.util.Scanner;

// Fa�a um aplicativo que leia o pre�o de 8 produtos. No final, mostre na tela qual foi o maior e qual foi o menor pre�o digitados.

public class Exercicio51 {
	
	public Double exercicio51(double preco_exerc51) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.printf("Exerc�cio 51 - Fa�a um aplicativo que leia o pre�o de 8 produtos. No final, mostre na tela qual foi o maior e qual foi o menor pre�o digitados.\n\n");
		
		int auxiliar_exerc51 = 1;
		double maiorPreco_exerc51 = 0;
		double menorPreco_exerc51 = 0;
		
		while (auxiliar_exerc51 < 9) {
			
			System.out.printf("Insira %d� pre�o --> R$", auxiliar_exerc51);
			preco_exerc51 = input.nextDouble();
			
			if (auxiliar_exerc51 == 1) {
				
				maiorPreco_exerc51 = preco_exerc51;
				menorPreco_exerc51 = preco_exerc51;
				
			}
			
			if (preco_exerc51 > maiorPreco_exerc51) {
				
				maiorPreco_exerc51 = preco_exerc51;
				
			}
			
			if (preco_exerc51 < menorPreco_exerc51) {
				
				menorPreco_exerc51 = preco_exerc51;
				
			}
			
			auxiliar_exerc51++;
		}
		
		System.out.printf("\nMaior pre�o --> R$%.2f\n", maiorPreco_exerc51);
		System.out.printf("Menor pre�o --> R$%.2f", menorPreco_exerc51);
		
		System.out.printf("\n\n====================================================================================================================\n");
		
		return null;
	}
}