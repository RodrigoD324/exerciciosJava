package repeticoesEnquanto;

import java.util.Scanner;

// Desenvolva um programa que mostre na tela a seguinte contagem: 100 95 90 85 80 ... 0 Acabou!

public class Exercicio41 {

	public int exercicio41 (int contagem_exerc41) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exercício 41 - Desenvolva um programa que mostre na tela a seguinte contagem: 100 95 90 85 80 ... 0 Acabou!\n");
		
		System.out.println("Insira número '100'");
		contagem_exerc41 = input.nextInt();
		
		while (contagem_exerc41 > -1) {
			
			System.out.printf("%d ", contagem_exerc41);
			contagem_exerc41 = contagem_exerc41 - 5;
			
		}
		
		System.out.println("Acabou!");
		
		System.out.println("\n====================================================================================================================\n");
		
		return 0;
	}
}