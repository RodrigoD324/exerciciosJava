package condicoesCompostas;

import java.util.Scanner;

//Fa�a um programa que leia a largura e o comprimento de um terreno retangular, calculando e mostrando a sua �rea em m�. O programa tamb�m deve mostrar a classifica��o desse terreno.

public class Exercicio28 {

	public int exercicio28(int largura_exerc28 , int comprimento_exerc28 , int area_exerc28) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exerc�cio 28 - Fa�a um programa que leia a largura e o comprimento de um terreno retangular, calculando e mostrando a sua �rea em m�. O programa tamb�m deve mostrar a classifica��o desse terreno.\n");
		
		System.out.println("Por favor, digite valor da largura --> ");
		largura_exerc28 = input.nextInt();
		System.out.println("Por favor, digite valor do comprimento --> ");
		comprimento_exerc28 = input.nextInt();
		
		area_exerc28 = largura_exerc28 * comprimento_exerc28;
		
		if (area_exerc28 < 100) {
			
			System.out.printf("\n�REA IGUAL A %dM QUADRADOS!  SITUA��O: TERRENO POPULAR!\n", area_exerc28);
			
		} else {
			
			if (area_exerc28 > 500) {
				
				System.out.printf("\n�REA IGUAL A %dM QUADRADOS!  SITUA��O: TERRENO VIP!\n", area_exerc28);
				
			} else {

				System.out.printf("\n�REA IGUAL A %dM QUADRADOS!  SITUA��O: TERRENO MASTER!\n", area_exerc28);
				
			}
		}
		
		System.out.println("\n====================================================================================================================\n");
		
		return 0;
	}
}