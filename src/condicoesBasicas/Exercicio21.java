package condicoesBasicas;

import java.util.Scanner;

// Fa�a um algoritmo que leia um determinado ano e mostre se ele � ou n�o BISSEXTO.

public class Exercicio21 {

	public int exercicio21(int ano_exerc21 , int resto_exerc21) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exerc�cio 21 - Fa�a um algoritmo que leia um determinado ano e mostre se ele � ou n�o BISSEXTO.\n");
		
		System.out.println("Digite determinado ano --> ");
		ano_exerc21 = input.nextInt();
		
		resto_exerc21 = ano_exerc21 % 4;
		
		if (resto_exerc21 == 0) {
			
			System.out.printf("\nANO DE %d � BISSEXTO!\n", ano_exerc21);
			
		} else {

			System.out.printf("\nANO DE %d N�O � BISSEXTO!\n", ano_exerc21);
			
		}
		
		System.out.println("\n====================================================================================================================\n");
				
		return 0;
	}
}