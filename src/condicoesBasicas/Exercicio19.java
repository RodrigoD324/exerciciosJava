package condicoesBasicas;

import java.util.Scanner;

//Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua média e mostre na tela. No final, analise a média e mostre se o aluno teve ou não um bom aproveitamento (se ficou acima da média 7.0).


public class Exercicio19 {
	
	public Double exercicio19(double nota1_exerc19 , double nota2_exerc19, double media_exerc19 , String nome_exerc19) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exercício 19 - Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua média e mostre na tela. No final, analise a média e mostre se o aluno teve ou não um bom aproveitamento (se ficou acima da média 7.0).\n");
		
		System.out.println("Digite seu nome --> ");
		nome_exerc19 = input.nextLine();
		System.out.println("Digite sua nota 1 --> ");
		nota1_exerc19 = input.nextDouble();
		System.out.println("Digite sua nota 2 --> ");
		nota2_exerc19 = input.nextDouble();
		
		media_exerc19 = (nota1_exerc19 + nota2_exerc19) / 2;
		
		System.out.printf("\nALUNO: %s", nome_exerc19);
		System.out.printf("\nNOTA 1: %.2f", nota1_exerc19);
		System.out.printf("\nNOTA 2: %.2f", nota2_exerc19);
		System.out.printf("\nMÉDIA: %.2f\n", media_exerc19);
		
		if (media_exerc19 >= 7.0) {
			
			System.out.printf("\nALUNO %s OBTEVE BOM APROVEITAMENTO DA DISCIPLINA!\n", nome_exerc19);
			
		} else {

			System.out.printf("\nALUNO %s NÃO OBTEVE BOM APROVEITAMENTO DA DISCIPLINA!\n", nome_exerc19);
			
		}
		
		System.out.println("\n====================================================================================================================\n");
		
		return null;
	}
}