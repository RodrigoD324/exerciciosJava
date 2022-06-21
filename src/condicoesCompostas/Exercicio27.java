package condicoesCompostas;

import java.util.Scanner;

//Crie um programa que leia duas notas de um aluno e calcule a sua média, mostrando uma mensagem no final, de acordo com a média atingida


public class Exercicio27 {

	public Double exercicio27(double nota1_exerc27 , double nota2_exerc27 , double media_exerc27) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exercício 27 - Crie um programa que leia duas notas de um aluno e calcule a sua média, mostrando uma mensagem no final, de acordo com a média atingida.\n");
		
		System.out.println("Por favor, digite primeira nota --> ");
		nota1_exerc27 = input.nextDouble();
		System.out.println("Por favor, digite segunda nota --> ");
		nota2_exerc27 = input.nextDouble();
		
		media_exerc27 = (nota1_exerc27 + nota2_exerc27) / 2;
		
		if (media_exerc27 <= 4.9) {
			
			System.out.printf("\nMÉDIA: %.1f  SITUAÇÃO: REPROVADO!\n", media_exerc27);
			
		} else {
			
			if (media_exerc27 >= 7.0) {
				
				System.out.printf("\nMÉDIA: %.1f  SITUAÇÃO: APROVADO!\n", media_exerc27);
				
			} else {

				System.out.printf("\nMÉDIA: %.1f  SITUAÇÃO: RECUPERAÇÃO!\n", media_exerc27);
				
			}
		}
		
		System.out.println("\n====================================================================================================================\n");
		
		return null;
	}
}