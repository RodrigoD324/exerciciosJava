package condicoesBasicas;

import java.util.Scanner;

//Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade dela e depois mostre se ela pode ou não votar.

public class Exercicio18 {

	public int exercicio18(int ano_exerc18 , int idade_exerc18) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exercício 18 - Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade dela e depois mostre se ela pode ou não votar.\n");
		
		System.out.println("Digite o ano de nascimento --> ");
		ano_exerc18 = input.nextInt();
		
		idade_exerc18 = 2022 - ano_exerc18;
		
		if (idade_exerc18 >= 18) {
			
			System.out.printf("\nCIDADÃO CAPACITADO PARA VOTAR, POIS POSSUÍ %d ANOS DE IDADE!\n", idade_exerc18);
			
		} else {

			System.out.printf("\nCIDADÃO INCAPACITADO PARA VOTAR, POIS POSSUÍ %d ANOS DE IDADE!\n", idade_exerc18);
			
		} 
		
		System.out.println("\n====================================================================================================================\n");
		
		return 0;
	}
}