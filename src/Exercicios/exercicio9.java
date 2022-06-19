package Exercicios;

import java.util.Scanner;

//Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$) e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.

public class exercicio9 {
	
	public Double Exercicio9(double carteira_exerc9 , double dolares_exerc9) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Exercício 9 - Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$) e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.\n");
		
		System.out.println("Digite quantidade de dinheiro (em R$) em sua carteira --> ");
		carteira_exerc9 = input.nextDouble();
		
		dolares_exerc9 = carteira_exerc9 * 3.45;
		
		System.out.printf("\nQuantidade de %.2fR$ armazenada na carteira.\n", carteira_exerc9);
		System.out.printf("Quantidade de %.2fUS$ se convertido o real para dólar.\n", dolares_exerc9);
		
		System.out.println("\n====================================================================================================================\n");
		
		return null;
	}

}
