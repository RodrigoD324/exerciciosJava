package repeticoesEnquanto;

import java.util.Scanner;

//  Fa�a um algoritmo que mostre na tela a seguinte contagem: 10 9 8 7 6 5 4 3 Acabou!

public class Exercicio39 {
	
	public int exercicio39 (int contagem_exerc39) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exerc�cio 39 - Fa�a um algoritmo que mostre na tela a seguinte contagem: 10 9 8 7 6 5 4 3 Acabou!\n");
		
		System.out.println("Insira n�mero '10'");
		contagem_exerc39 = input.nextInt();
		
		while (contagem_exerc39 > 2) {
			
			System.out.printf("%d ", contagem_exerc39);
			contagem_exerc39 = contagem_exerc39 - 1;
			
		}
		
		System.out.println("Acabou!");
		
		System.out.println("\n====================================================================================================================\n");
		
		return 0;
	}
}