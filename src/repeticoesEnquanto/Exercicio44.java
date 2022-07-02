package repeticoesEnquanto;

import java.util.Scanner;

// Crie um algoritmo que leia o valor inicial da contagem, o valor final e o incremento, mostrando em seguida todos os valores no intervalo

public class Exercicio44 {
	
	public int exercicio44(int valorInicial_exerc44 , int valorFinal_exerc44 , int incremento_exerc44) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exercício 44 - Crie um algoritmo que leia o valor inicial da contagem, o valor final e o incremento, mostrando em seguida todos os valores no intervalo\n");
		
		System.out.println("Insira valor inicial da contagem: ");
		valorInicial_exerc44 = input.nextInt();
		System.out.println("Insira valor final da contagem: ");
		valorFinal_exerc44 = input.nextInt();
		System.out.println("Insira incremento da contagem: ");
		incremento_exerc44 = input.nextInt();
		
		System.out.printf("Contagem: ");
		
		while (valorInicial_exerc44 < valorFinal_exerc44) {
			
			System.out.printf("%d ", valorInicial_exerc44);
			valorInicial_exerc44 = valorInicial_exerc44 + incremento_exerc44;
			
		}
		
		System.out.printf("Acabou!");
		
		System.out.println("\n\n====================================================================================================================\n");
		
		return 0;
	}
}