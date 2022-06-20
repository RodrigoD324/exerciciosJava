package condicoesBasicas;

import java.util.Scanner;

// Faça um algoritmo que leia um determinado ano e mostre se ele é ou não BISSEXTO.

public class Exercicio21 {

	public int exercicio21(int ano_exerc21 , int resto_exerc21) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exercício 21 - Faça um algoritmo que leia um determinado ano e mostre se ele é ou não BISSEXTO.\n");
		
		System.out.println("Digite determinado ano --> ");
		ano_exerc21 = input.nextInt();
		
		resto_exerc21 = ano_exerc21 % 4;
		
		if (resto_exerc21 == 0) {
			
			System.out.printf("\nANO DE %d É BISSEXTO!\n", ano_exerc21);
			
		} else {

			System.out.printf("\nANO DE %d NÃO É BISSEXTO!\n", ano_exerc21);
			
		}
		
		System.out.println("\n====================================================================================================================\n");
				
		return 0;
	}
}