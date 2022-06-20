package sequenciasBasicas;

import java.util.Scanner;

//Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a sua terça parte.

public class exercicio7 {

	public Double Exercicio7(double num_exerc7 , double dobro_exerc7 , double terca_exerc7) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exercício 7 - Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a sua terça parte.\n");
		
		System.out.println("Digite um número --> ");
		num_exerc7 = input.nextDouble();
		
		dobro_exerc7 = num_exerc7 * 2;
		terca_exerc7 = num_exerc7 / 3;
		
		System.out.printf("O dobro de %.1f é %.1f\n", num_exerc7, dobro_exerc7);
		System.out.printf("A terça parte de %.1f é %.4f\n", num_exerc7, terca_exerc7);
		
		System.out.println("\n====================================================================================================================\n");
		
		return null;
	}
	
}
