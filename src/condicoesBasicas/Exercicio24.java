package condicoesBasicas;

import java.util.Scanner;

//Faça um algoritmo que pergunte a distância que um passageiro deseja percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para viagens até 200Km e R$0.45 para viagens mais longas.

public class Exercicio24 {
	
	public Double exercicio24(double distancia_exerc24 , double preco_exerc24) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exercício 24 - Faça um algoritmo que pergunte a distância que um passageiro deseja percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para viagens até 200Km e R$0.45 para viagens mais longas.\n");
		
		System.out.println("Digite a distância desejada a percorrer em KM --> ");
		distancia_exerc24 = input.nextDouble();
		
		if (distancia_exerc24 <= 200) {
			
			preco_exerc24 = distancia_exerc24 * 0.50;
			
			System.out.printf("\nDISTÂNCIA PERCORRIDA DE %.1fKM, PREÇO A SE PAGAR --> %.2fR$\n", distancia_exerc24, preco_exerc24);
			
		} else {

			preco_exerc24 = distancia_exerc24 * 0.45;
			
			System.out.printf("\nDISTÂNCIA PERCORRIDA DE %.1fKM, PREÇO A SE PAGAR --> %.2fR$\n", distancia_exerc24, preco_exerc24);
			
		}
		
		System.out.println("\n====================================================================================================================\n");
		
		return null;
	}
}