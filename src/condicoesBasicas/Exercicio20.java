package condicoesBasicas;

import java.util.Scanner;

// Desenvolva um programa que leia um n�mero inteiro e mostre se ele � PAR ou �MPAR.

public class Exercicio20 {

	public int exercicio20(int num_exerc20, int resto_exerc20) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exerc�cio 20 - Desenvolva um programa que leia um n�mero inteiro e mostre se ele � PAR ou �MPAR.\n");
		
		System.out.println("Digite um n�mero inteiro qualquer --> ");
		num_exerc20 = input.nextInt();
		
		resto_exerc20 = num_exerc20 % 2;
		
		if (resto_exerc20 == 0) {
			
			System.out.printf("\nN�MERO INTEIRO %d � PAR!\n", num_exerc20);
			
		} else {

			System.out.printf("\nN�MERO INTEIRO %d � �MPAR!\n", num_exerc20);
			
		}
		
		System.out.println("\n====================================================================================================================\n");
		
		return 0;
	}
}