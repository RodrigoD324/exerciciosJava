package condicoesCompostas;

import java.util.Scanner;

//Refaça o algoritmo 25, acrescentando o recurso de mostrar que tipo de triângulo será formado

public class Exercicio30 {
	
	public int exercicio30(int a_exerc30 , int b_exerc30 , int c_exerc30) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exercício 30 - Refaça o algoritmo 25, acrescentando o recurso de mostrar que tipo de triângulo será formado.\n");
		
		System.out.println("Digite valor do segmento 'a' --> ");
		a_exerc30 = input.nextInt();
		System.out.println("Digite valor do segmento 'b' --> ");
		b_exerc30 = input.nextInt();
		System.out.println("Digite valor do segmento 'c' --> ");
		c_exerc30 = input.nextInt();
		
		//| b - c | < a < b + c
		//| a - c | < b < a + c
		//| a - b | < c < a + b
		
		int auxiliarA1_exerc30 = b_exerc30 - c_exerc30;
		int auxiliarA2_exerc30 = b_exerc30 + c_exerc30;
		
		int auxiliarB1_exerc30 = a_exerc30 - c_exerc30;
		int auxiliarB2_exerc30 = a_exerc30 + c_exerc30;
		
		int auxiliarC1_exerc30 = a_exerc30 - b_exerc30;
		int auxiliarC2_exerc30 = a_exerc30 + b_exerc30;
		
		if (auxiliarA1_exerc30 < a_exerc30 && a_exerc30 < auxiliarA2_exerc30 && auxiliarB1_exerc30 < b_exerc30 && b_exerc30 < auxiliarB2_exerc30 && auxiliarC1_exerc30 < c_exerc30 && c_exerc30 < auxiliarC2_exerc30) {
			
			System.out.println("\nCOM ESSES SEGMENTOS É POSSÍVEL A CRIAÇÃO DE UM TRIÂNGULO!!\n");
			
			if (a_exerc30 == b_exerc30 && b_exerc30 == c_exerc30 && a_exerc30 == c_exerc30) {
				
				System.out.printf("A = %d  B = %d  C = %d  | OS LADOS SÃO IGUAIS, LOGO O TRIÂNGULO É EQUILÁTERO!\n", a_exerc30, b_exerc30, c_exerc30);
				
			} else {
				
				if (a_exerc30 == b_exerc30 || b_exerc30 == c_exerc30 || a_exerc30 == c_exerc30) {
					
					System.out.printf("A = %d  B = %d  C = %d  | DOIS LADOS SÃO IGUAIS, LOGO O TRIÂNGULO É ISÓSCELES!\n", a_exerc30, b_exerc30, c_exerc30);
					
				} else {
					
					System.out.printf("A = %d  B = %d  C = %d  | OS LADOS SÃO DIFERENTES, LOGO O TRIÂNGULO É ESCALENO!\n", a_exerc30, b_exerc30, c_exerc30);

				}

			}
			
		} else {

			System.out.println("\nCOM ESSES SEGMENTOS NÃO É POSSÍVEL A CRIAÇÃO DE UM TRIÂNGULO!!\n");
			
		}
		
		System.out.println("\n====================================================================================================================\n");
		
		return 0;
	}
}