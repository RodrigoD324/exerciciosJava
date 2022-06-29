package repeticoesEnquanto;

import java.util.Scanner;

//  Crie um aplicativo que mostre na tela a seguinte contagem: 0 3 6 9 12 15 18 Acabou!

public class Exercicio40 {
	
	public int exercicio40 (int contagem_exerc40) {

		Scanner input = new Scanner (System.in);
		
		System.out.println("Exercício 40 - Crie um aplicativo que mostre na tela a seguinte contagem: 0 3 6 9 12 15 18 Acabou!\n");
		
		System.out.println("Pressione a tecla '0'");
		contagem_exerc40 = input.nextInt();
		
		while (contagem_exerc40 < 19) {
			
			System.out.printf("%d ", contagem_exerc40);
			contagem_exerc40 = contagem_exerc40 + 3;
			
		}
		
		System.out.println("Acabou!");
		
		System.out.println("\n====================================================================================================================\n");
		
		return 0;
	}
}