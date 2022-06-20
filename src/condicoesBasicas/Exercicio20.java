package condicoesBasicas;

import java.util.Scanner;

// Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou ÍMPAR.

public class Exercicio20 {

	public int exercicio20(int num_exerc20, int resto_exerc20) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exercício 20 - Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou ÍMPAR.\n");
		
		System.out.println("Digite um número inteiro qualquer --> ");
		num_exerc20 = input.nextInt();
		
		resto_exerc20 = num_exerc20 % 2;
		
		if (resto_exerc20 == 0) {
			
			System.out.printf("\nNÚMERO INTEIRO %d É PAR!\n", num_exerc20);
			
		} else {

			System.out.printf("\nNÚMERO INTEIRO %d É ÍMPAR!\n", num_exerc20);
			
		}
		
		System.out.println("\n====================================================================================================================\n");
		
		return 0;
	}
}