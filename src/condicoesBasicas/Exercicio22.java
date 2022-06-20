package condicoesBasicas;

import java.util.Scanner;

// Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua situação em relação ao alistamento militar.

public class Exercicio22 {
	
	public int exercicio22(int ano_exerc22 , int idade_exerc22 , int auxiliar_exerc22) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exercício 22 - Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua situação em relação ao alistamento militar.\n");
		
		System.out.println("Por favor, digite seu ano de nascimento --> ");
		ano_exerc22 = input.nextInt();
		
		idade_exerc22 = 2022 - ano_exerc22;
		
		if (idade_exerc22 > 18) {
			
			auxiliar_exerc22 = idade_exerc22 - 18;
			
			System.out.printf("\nCIDADÃO COM %d ANOS DE IDADE. JÁ SE PASSARAM %d ANOS DESDE O ALISTAMENTO!\n", idade_exerc22, auxiliar_exerc22);
			
		} else {
			
			if (idade_exerc22 < 18) {
				
				auxiliar_exerc22 = 18 - idade_exerc22;
				
				System.out.printf("\nCIDADÃO COM %d ANOS DE IDADE. FALTAM %d ANOS PARA O ALISTAMENTO!\n", idade_exerc22, auxiliar_exerc22);
				
			} else {
				
				System.out.printf("\nCIDADÃO COM %d ANOS DE IDADE. SEU ALISTAMENTO É ESSE ANO!\n", idade_exerc22);
				
			}
		}
		
		System.out.println("\n====================================================================================================================\n");
		
		return 0;
	}
}