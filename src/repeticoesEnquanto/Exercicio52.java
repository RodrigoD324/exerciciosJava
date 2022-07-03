package repeticoesEnquanto;

import java.util.Scanner;

// Crie um algoritmo que leia a idade de 10 pessoas, mostrando no final.

public class Exercicio52 {
	
	public int exercicio52(int idade_exerc52 , int media_exerc52) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.printf("Exercício 52 - Crie um algoritmo que leia a idade de 10 pessoas, mostrando no final.\n\n");
		
		int auxiliar_exerc52 = 1;
		int anos18_exerc52 = 0;
		int anos5_exerc52 = 0;
		int maiorIdade_exerc52 = 0;
		
		while (auxiliar_exerc52 < 11) {
			
			System.out.printf("Digite %dº idade --> ", auxiliar_exerc52);
			idade_exerc52 = input.nextInt();
			
			media_exerc52 += idade_exerc52;
			
			if (idade_exerc52 > 18) {
				anos18_exerc52++;
			}
			if (idade_exerc52 < 5) {
				anos5_exerc52++;
			}
			
			if (auxiliar_exerc52 == 1) {
				
				maiorIdade_exerc52 = idade_exerc52;
				
			}
			
			if (idade_exerc52 > maiorIdade_exerc52) {
				
				maiorIdade_exerc52 = idade_exerc52;
				
			}
			
			auxiliar_exerc52++;
		}
		
		media_exerc52 = media_exerc52 / 10;
		
		System.out.printf("\nMédia de idade do grupo --> %d", media_exerc52);
		System.out.printf("\nQuantas pessoas tem mais de 18 anos de idade --> %d", anos18_exerc52);
		System.out.printf("\nQuantas pessoas tem menos de 5 anos de idade --> %d", anos5_exerc52);
		System.out.printf("\nA maior idade do grupo é --> %d", maiorIdade_exerc52);
		
		System.out.printf("\n\n====================================================================================================================\n");
		
		return 0;
	}
}