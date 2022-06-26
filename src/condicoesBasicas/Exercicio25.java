package condicoesBasicas;

import java.util.Scanner;

//Crie um programa que leia o tamanho de tr�s segmentos de reta. Analise seus comprimentos e diga se � poss�vel formar um tri�ngulo com essas retas. Matematicamente, para tr�s segmentos formarem um tri�ngulo, o comprimento de cada lado deve ser menor que a soma dos outros dois.

public class Exercicio25 {
	
	public int exercicio25(int a_exerc25 , int b_exerc25 , int c_exerc25) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exerc�cio 25 - Crie um programa que leia o tamanho de tr�s segmentos de reta. Analise seus comprimentos e diga se � poss�vel formar um tri�ngulo com essas retas. Matematicamente, para tr�s segmentos formarem um tri�ngulo, o comprimento de cada lado deve ser menor que a soma dos outros dois.\n");
		
		System.out.println("Digite valor do segmento 'a' --> ");
		a_exerc25 = input.nextInt();
		System.out.println("Digite valor do segmento 'b' --> ");
		b_exerc25 = input.nextInt();
		System.out.println("Digite valor do segmento 'c' --> ");
		c_exerc25 = input.nextInt();
		
		//| b - c | < a < b + c
		//| a - c | < b < a + c
		//| a - b | < c < a + b
		
		int auxiliarA1_exerc25 = b_exerc25 - c_exerc25;
		int auxiliarA2_exerc25 = b_exerc25 + c_exerc25;
		
		int auxiliarB1_exerc25 = a_exerc25 - c_exerc25;
		int auxiliarB2_exerc25 = a_exerc25 + c_exerc25;
		
		int auxiliarC1_exerc25 = a_exerc25 - b_exerc25;
		int auxiliarC2_exerc25 = a_exerc25 + b_exerc25;
		
		if (auxiliarA1_exerc25 < a_exerc25 && a_exerc25 < auxiliarA2_exerc25 && auxiliarB1_exerc25 < b_exerc25 && b_exerc25 < auxiliarB2_exerc25 && auxiliarC1_exerc25 < c_exerc25 && c_exerc25 < auxiliarC2_exerc25) {
			
			System.out.println("\nCOM ESSES SEGMENTOS � POSS�VEL A CRIA��O DE UM TRI�NGULO!!");
			
		} else {

			System.out.println("\nCOM ESSES SEGMENTOS N�O � POSS�VEL A CRIA��O DE UM TRI�NGULO!!");
			
		}
		
		System.out.println("\n====================================================================================================================\n");
		
		return 0;
	}
}