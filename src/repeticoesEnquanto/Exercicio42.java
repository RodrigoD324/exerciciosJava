package repeticoesEnquanto;

import java.util.Scanner;

//  Faça um algoritmo que pergunte ao usuário um número inteiro e positivo qualquer e mostre uma contagem até esse valor: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!

public class Exercicio42 {
	
	public int exercicio42 (int contagem_exerc42) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exercício 42 - Faça um algoritmo que pergunte ao usuário um número inteiro e positivo qualquer e mostre uma contagem até esse valor: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!\n");
		
		System.out.println("Infome um número inteiro qualquer:");
		contagem_exerc42 = input.nextInt();
		
		int auxiliar_exerc42 = 0;
		
		while (auxiliar_exerc42 <= contagem_exerc42) {
			
			System.out.printf("%d ", auxiliar_exerc42);
			auxiliar_exerc42 = auxiliar_exerc42 + 1;
			
		}
		
		System.out.println("\n\n====================================================================================================================\n");
		
		return 0;
	}
}