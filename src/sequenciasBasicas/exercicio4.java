package sequenciasBasicas;

import java.util.Scanner;

// Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório entre eles.

public class exercicio4 {

	public int Exercicio4 (int num1_exerc4 , int num2_exerc4 , int result_exerc4) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Exercício 4 - Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório entre eles.\n");
		
		System.out.println("Digite primeiro valor --> ");
		num1_exerc4 = input.nextInt();
		System.out.println("Digite segundo valor --> ");
		num2_exerc4 = input.nextInt();
		
		result_exerc4 = num1_exerc4 + num2_exerc4;
		
		System.out.printf("A soma entre %d e %d é igual a %d.\n", num1_exerc4, num2_exerc4, result_exerc4);
		
		System.out.println("\n====================================================================================================================\n");
		
		return 0;
	}	
}
