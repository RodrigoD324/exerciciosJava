package repeticoesEnquanto;

import java.util.Scanner;

//  Escreva um programa que mostre na tela a seguinte contagem: 6 7 8 9 10 11 Acabou!

public class Exercicio38 {
	
	public int exercicio38(int contagem_exerc38) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exercício 38 -  Escreva um programa que mostre na tela a seguinte contagem: 6 7 8 9 10 11 Acabou!\n");
		
		System.out.println("Pressione a tecla '6'");
		contagem_exerc38 = input.nextInt();
		
		while (contagem_exerc38 < 12) {
			
			System.out.printf("%d ", contagem_exerc38);
			contagem_exerc38 = contagem_exerc38 + 1;
			
		}
		
		System.out.println("Acabou!");
		
		System.out.println("\n====================================================================================================================\n");
		
		return 0;
	}
}