package sequenciasBasicas;

import java.util.Scanner;

// Desenvolva uma lógica que leia os valores de A, B e C de uma equação do segundo grau e mostre o valor de Delta.

public class exercicio11 {
	
	public Double Exercicio11(double a_exerc11 , double b_exerc11 , double c_exerc11 , double delta_exerc11) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exercício 11 - Desenvolva uma lógica que leia os valores de A, B e C de uma equação do segundo grau e mostre o valor de Delta.\n");
		
		System.out.println("Digite valor de 'A' --> ");
		a_exerc11 = input.nextDouble();
		System.out.println("Digite valor de 'B' --> ");
		b_exerc11 = input.nextDouble();
		System.out.println("Digite valor de 'C' --> ");
		c_exerc11 = input.nextDouble();
		
		delta_exerc11 = (b_exerc11 * b_exerc11) - 4 * a_exerc11 * c_exerc11;
		
		System.out.printf("\nCom esses valores, o resultado de Delta é igual a --> %.1f\n", delta_exerc11);
		
		System.out.println("\n====================================================================================================================\n");
		
		return null;
	}

}
