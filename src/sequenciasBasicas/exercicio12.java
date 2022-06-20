package sequenciasBasicas;

import java.util.Scanner;

//Crie um programa que leia o preço de um produto, calcule e mostre o seu PREÇO PROMOCIONAL, com 5% de desconto.

public class exercicio12 {
	
	public Double Exercicio12(double preco_exerc12 , double promocao_exerc12) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exercício 12 - Crie um programa que leia o preço de um produto, calcule e mostre o seu PREÇO PROMOCIONAL, com 5% de desconto.\n");
		
		System.out.println("Digite preço original de n produto --> ");
		preco_exerc12 = input.nextDouble();
		System.out.println("Digite porcentagem (não necessita do símbolo '%') da promoção de n produto --> ");
		promocao_exerc12 = input.nextDouble();
		
		promocao_exerc12 = (promocao_exerc12 / 100) * preco_exerc12;
		
		preco_exerc12 = preco_exerc12 - promocao_exerc12;
		
		System.out.printf("\nValor do item com promoção igual a --> %.1f\n", preco_exerc12);
		
		System.out.println("\n====================================================================================================================\n");
		
		return null;
	}

}
