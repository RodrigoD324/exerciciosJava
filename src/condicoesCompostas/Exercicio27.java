package condicoesCompostas;

import java.util.Scanner;

//Crie um programa que leia duas notas de um aluno e calcule a sua m�dia, mostrando uma mensagem no final, de acordo com a m�dia atingida


public class Exercicio27 {

	public Double exercicio27(double nota1_exerc27 , double nota2_exerc27 , double media_exerc27) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exerc�cio 27 - Crie um programa que leia duas notas de um aluno e calcule a sua m�dia, mostrando uma mensagem no final, de acordo com a m�dia atingida.\n");
		
		System.out.println("Por favor, digite primeira nota --> ");
		nota1_exerc27 = input.nextDouble();
		System.out.println("Por favor, digite segunda nota --> ");
		nota2_exerc27 = input.nextDouble();
		
		media_exerc27 = (nota1_exerc27 + nota2_exerc27) / 2;
		
		if (media_exerc27 <= 4.9) {
			
			System.out.printf("\nM�DIA: %.1f  SITUA��O: REPROVADO!\n", media_exerc27);
			
		} else {
			
			if (media_exerc27 >= 7.0) {
				
				System.out.printf("\nM�DIA: %.1f  SITUA��O: APROVADO!\n", media_exerc27);
				
			} else {

				System.out.printf("\nM�DIA: %.1f  SITUA��O: RECUPERA��O!\n", media_exerc27);
				
			}
		}
		
		System.out.println("\n====================================================================================================================\n");
		
		return null;
	}
}