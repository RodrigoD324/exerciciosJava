package repeticoesEnquanto;

import java.util.Scanner;

//  Escreva um programa que mostre na tela a seguinte contagem

public class Exercicio38 {
	
	public int exercicio38(int contagem_exerc38) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exerc�cio 38 -  Escreva um programa que mostre na tela a seguinte contagem\n");
		
		System.out.println("Informe um dig�to inteiro --> ");
		contagem_exerc38 = input.nextInt();
		
		while (contagem_exerc38 < 12) {
			
			System.out.printf("%d ", contagem_exerc38);
			contagem_exerc38 = contagem_exerc38 + 1;
			
		}
		
		System.out.println("Acabou!");
		
		return 0;
	}

}
