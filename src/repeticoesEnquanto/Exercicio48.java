package repeticoesEnquanto;

import java.util.Scanner;

// Fa�a um programa que leia 7 n�meros inteiros e no final mostre o somat�rio entre eles.


public class Exercicio48 {
	
	public int exercicio48(int numero_exerc48 , int soma_exerc48) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.printf("Exerc�cio 48 - Fa�a um programa que leia 7 n�meros inteiros e no final mostre o somat�rio entre eles.\n\n");
		
		int auxiliar_exerc48 = 1;
		
		while (auxiliar_exerc48 < 8) {
			
			numero_exerc48 = numero_exerc48 + numero_exerc48;
			System.out.printf("Insira n�mero inteiro %d --> ", auxiliar_exerc48);
			numero_exerc48 = input.nextInt();
			soma_exerc48 += numero_exerc48;
			
			auxiliar_exerc48++;
		}
		
		System.out.printf("\nResultado: %d", soma_exerc48);
		
		System.out.printf("\n\n====================================================================================================================\n");
		
		return 0;
	}
}