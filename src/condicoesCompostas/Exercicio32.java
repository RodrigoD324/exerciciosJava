package condicoesCompostas;

import java.util.Scanner;

//Crie um jogo onde o computador vai sortear um número entre 1 e 5 o jogador vai tentar descobrir qual foi o valor sorteado.

public class Exercicio32 {
	
	public String exercicio32(String num_exerc32) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exercício 32 - Crie um jogo onde o computador vai sortear um número entre 1 e 5 o jogador vai tentar descobrir qual foi o valor sorteado.\n");
		
		System.out.println("Sorteei um número entre 1 e 5, tente advinhar qual eu selecionei!");
		num_exerc32 = input.next();
		
		if (num_exerc32.equals("2")) {
			
			System.out.println("\nBooa! Opção correta! :)");
			
		} else {

			if (num_exerc32.equals("1") || num_exerc32.equals("3") || num_exerc32.equals("4") || num_exerc32.equals("5")) {
				
				System.out.println("\nOps! Opção errada! :(");
				
			} else {

				System.out.println("\nCalma lá, amigão! Selecione um número entre 1 e 5! :|");
				
			}	
		}
		
		System.out.println("\n====================================================================================================================\n");
		
		return null;
	}
}