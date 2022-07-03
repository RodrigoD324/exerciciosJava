package repeticoesEnquanto;

import java.util.Scanner;

// Crie um programa que leia 6 números inteiros e no final mostre quantos deles são pares e quantos são ímpares.

public class Exercicio49 {
	
	public int exercicio49 (int numero_exerc49) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.printf("Exercício 49 - Crie um programa que leia 6 números inteiros e no final mostre quantos deles são pares e quantos são ímpares.\n\n");
		int auxiliarWhile_exerc49 = 1;
		int auxiliarImparPar_exerc49 = 0;
		int par_exerc49 = 0;
		int impar_exerc49 = 0;
		
		while (auxiliarWhile_exerc49 < 7) {
			
			System.out.printf("Insira qualquer número inteiro --> ");
			numero_exerc49 = input.nextInt();
			auxiliarImparPar_exerc49 = numero_exerc49 % 2;
			
			if (auxiliarImparPar_exerc49 == 0) {
				
				par_exerc49++;
				
			} else {
				
				impar_exerc49++;
				
			}
			
			auxiliarWhile_exerc49++;
		}
		
		System.out.printf("\n%d números pares\n", par_exerc49);
		System.out.printf("%d números ímpares", impar_exerc49);
		
		System.out.printf("\n\n====================================================================================================================\n");
		
		return 0;
	}
}