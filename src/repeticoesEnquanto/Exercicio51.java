package repeticoesEnquanto;

import java.util.Scanner;

// Faça um aplicativo que leia o preço de 8 produtos. No final, mostre na tela qual foi o maior e qual foi o menor preço digitados.

public class Exercicio51 {
	
	public Double exercicio51(double preco_exerc51) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.printf("Exercício 51 - Faça um aplicativo que leia o preço de 8 produtos. No final, mostre na tela qual foi o maior e qual foi o menor preço digitados.\n\n");
		
		int auxiliar_exerc51 = 1;
		double maiorPreco_exerc51 = 0;
		double menorPreco_exerc51 = 0;
		
		while (auxiliar_exerc51 < 9) {
			
			System.out.printf("Insira %dº preço --> R$", auxiliar_exerc51);
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
		
		System.out.printf("\nMaior preço --> R$%.2f\n", maiorPreco_exerc51);
		System.out.printf("Menor preço --> R$%.2f", menorPreco_exerc51);
		
		System.out.printf("\n\n====================================================================================================================\n");
		
		return null;
	}
}