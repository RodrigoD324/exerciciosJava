package condicoesCompostas;

import java.util.Scanner;

// Escreva um algoritmo que leia dois n�meros inteiros e compare-os.

public class Exercicio26 {

	public int exercicio26(int num1_exerc26 , int num2_exerc26) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exerc�cio 26 - Escreva um algoritmo que leia dois n�meros inteiros e compare-os\n");
		
		System.out.println("Digite primeiro valor inteiro qualquer --> ");
		num1_exerc26 = input.nextInt();
		System.out.println("Digite segundo valor inteiro qualquer --> ");
		num2_exerc26 = input.nextInt();
		
		if (num1_exerc26 > num2_exerc26) {
			
			System.out.printf("\nO PRIMEIRO VALOR %d � MAIOR QUE O N�MERO INTEIRO %d!\n", num1_exerc26, num2_exerc26);
			
		} else {
			
			if (num2_exerc26 > num1_exerc26) {
				
				System.out.printf("\nO SEGUNDO VALOR %d � MAIOR QUE O N�MERO INTEIRO %d!\n", num2_exerc26, num1_exerc26);
				
			} else {

				System.out.println("\nN�O EXISTE VALOR MAIOR, OS DOIS S�O IGUAIS!");
				
			}
		}
		
		System.out.println("\n====================================================================================================================\n");
		
		return 0;
	}
}