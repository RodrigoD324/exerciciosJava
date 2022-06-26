package condicoesCompostas;

import java.util.Scanner;

// Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)

public class Exercicio31 {
	
	public String exercicio31(String jogador1_exerc31, String jogador2_exerc31) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exercício 31 - Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)\n");
		
		System.out.println("\t-------------===JOGO JOKENPÔ===-------------\n");
		
		System.out.println("JOGADOR 1, ESCOLHA ENTRE 'PEDRA' , 'PAPEL' , 'TESOURA!");
		jogador1_exerc31 = input.next();
		System.out.println("JOGADOR 2, ESCOLHA ENTRE 'PEDRA' , 'PAPEL' , 'TESOURA!");
		jogador2_exerc31 = input.next();
		
		String pedra_exerc31 = "PEDRA";
		String papel_exerc31 = "PAPEL";
		String tesoura_exerc31 = "TESOURA";
		
		if ((jogador1_exerc31.equals(pedra_exerc31) && jogador2_exerc31.equals(tesoura_exerc31)) || (jogador1_exerc31.equals(papel_exerc31) && jogador2_exerc31.equals(pedra_exerc31)) || (jogador1_exerc31.equals(tesoura_exerc31) && jogador2_exerc31.equals(papel_exerc31))) {
			
			System.out.printf("\nJOGADOR 1 = %s | JOGADOR 2 = %s", jogador1_exerc31, jogador2_exerc31);
			System.out.printf("\n\nLOGO JOGADOR 1 VENCEU! POIS %s VENCE %s!\n", jogador1_exerc31, jogador2_exerc31);
			
		} else {
			
			if ((jogador2_exerc31.equals(pedra_exerc31) && jogador1_exerc31.equals(tesoura_exerc31)) || (jogador2_exerc31.equals(papel_exerc31) && jogador1_exerc31.equals(pedra_exerc31)) || (jogador2_exerc31.equals(tesoura_exerc31) && jogador1_exerc31.equals(papel_exerc31))) {
				
				System.out.printf("\nJOGADOR 1 = %s | JOGADOR 2 = %s", jogador2_exerc31, jogador1_exerc31);
				System.out.printf("\n\nLOGO JOGADOR 2 VENCEU! POIS %s VENCE %s!\n", jogador2_exerc31, jogador1_exerc31);
				
			} else {
				
				System.out.printf("\nJOGADOR 1 = %s | JOGADOR 2 = %s", jogador1_exerc31, jogador2_exerc31);
				System.out.println("\n\nLOGO JOGADOR 1 E JOGADOR 2 EMPATARAM!");

			}

		}
		
		System.out.println("\n====================================================================================================================\n");
		
		return null;
	}
}