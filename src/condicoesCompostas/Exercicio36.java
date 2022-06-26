package condicoesCompostas;

import java.util.Scanner;

//Faça um programa que leia quantas horas de atividade uma pessoa teve por mês, calcule e mostre quantos pontos ela teve e quanto dinheiro ela conseguiu ganhar.

public class Exercicio36 {
	
	public int exercicio36(double horas_exerc36) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exercício 36 - Faça um programa que leia quantas horas de atividade uma pessoa teve por mês, calcule e mostre quantos pontos ela teve e quanto dinheiro ela conseguiu ganhar.\n");
		
		System.out.println("Por favor, informe a média de horas praticando exercícios físicos --> ");
		horas_exerc36 = input.nextDouble();
		
		int mediaHoras_exerc36 = 0;
		mediaHoras_exerc36 = (int) (horas_exerc36 * 30);
		
		if (mediaHoras_exerc36 <= 10) {
			
			int pontos_exerc36 = 0;
			pontos_exerc36 = mediaHoras_exerc36 * 2;
			
			double recompensa_exerc36 = 0;
			recompensa_exerc36 = pontos_exerc36 * 0.05;
			
			System.out.printf("\n%d Horas praticando exercícios físicos durantes o mês\n", mediaHoras_exerc36);
			System.out.printf("\n%d Pontos ganhos | %.2fR$ Faturados\n", pontos_exerc36, recompensa_exerc36);
			
		} else {
			
			if (mediaHoras_exerc36 > 10 && mediaHoras_exerc36 <= 20) {
				
				int pontos_exerc36 = 0;
				pontos_exerc36 = mediaHoras_exerc36 * 5;
				
				double recompensa_exerc36 = 0;
				recompensa_exerc36 = pontos_exerc36 * 0.05;
				
				System.out.printf("\n%d Horas praticando exercícios físicos durantes o mês\n", mediaHoras_exerc36);
				System.out.printf("\n%d Pontos ganhos | %.2fR$ Faturados\n", pontos_exerc36, recompensa_exerc36);
				
			} else {
				
				int pontos_exerc36 = 0;
				pontos_exerc36 = mediaHoras_exerc36 * 10;
				
				double recompensa_exerc36 = 0;
				recompensa_exerc36 = pontos_exerc36 * 0.05;
				
				System.out.printf("\n%d Horas praticando exercícios físicos durantes o mês\n", mediaHoras_exerc36);
				System.out.printf("\n%d Pontos ganhos | %.2fR$ Faturados\n", pontos_exerc36, recompensa_exerc36);

			}

		}
		
		System.out.println("\n====================================================================================================================\n");
		
		return 0;
	}
}