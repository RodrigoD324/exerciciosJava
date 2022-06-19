package Exercicios;

import java.util.Scanner;

//Faça um algoritmo que leia a largura e altura de uma parede, calcule e mostre a área a ser pintada e a quantidade de tinta necessária para o serviço, sabendo que cada litro de tinta pinta uma área de 2metros quadrados.

public class exercicio10 {

	public Double Exercicio10(double largura_exerc10 , double altura_exerc10 , double area_exerc10) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exercício 10 - Faça um algoritmo que leia a largura e altura de uma parede, calcule e mostre a área a ser pintada e a quantidade de tinta necessária para o serviço, sabendo que cada litro de tinta pinta uma área de 2metros quadrados.\n");
		
		System.out.println("Digite largura da parede --> ");
		largura_exerc10 = input.nextDouble();
		System.out.println("Digite altura da parede --> ");
		altura_exerc10 = input.nextDouble();
		
		area_exerc10 = altura_exerc10 * largura_exerc10;
		
		System.out.printf("\nÁrea da parede no total igual a --> %.1f Metros\n", area_exerc10);
		
		area_exerc10 = area_exerc10 / 2;
		
		System.out.printf("Quantidade de tinta necessária para pintar a parede igual a --> %.1f Litros\n", area_exerc10);
		
		System.out.println("\n====================================================================================================================\n");
		
		return null;
	}
	
}
