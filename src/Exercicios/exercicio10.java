package Exercicios;

import java.util.Scanner;

//Fa�a um algoritmo que leia a largura e altura de uma parede, calcule e mostre a �rea a ser pintada e a quantidade de tinta necess�ria para o servi�o, sabendo que cada litro de tinta pinta uma �rea de 2metros quadrados.

public class exercicio10 {

	public Double Exercicio10(double largura_exerc10 , double altura_exerc10 , double area_exerc10) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exerc�cio 10 - Fa�a um algoritmo que leia a largura e altura de uma parede, calcule e mostre a �rea a ser pintada e a quantidade de tinta necess�ria para o servi�o, sabendo que cada litro de tinta pinta uma �rea de 2metros quadrados.\n");
		
		System.out.println("Digite largura da parede --> ");
		largura_exerc10 = input.nextDouble();
		System.out.println("Digite altura da parede --> ");
		altura_exerc10 = input.nextDouble();
		
		area_exerc10 = altura_exerc10 * largura_exerc10;
		
		System.out.printf("\n�rea da parede no total igual a --> %.1f Metros\n", area_exerc10);
		
		area_exerc10 = area_exerc10 / 2;
		
		System.out.printf("Quantidade de tinta necess�ria para pintar a parede igual a --> %.1f Litros\n", area_exerc10);
		
		System.out.println("\n====================================================================================================================\n");
		
		return null;
	}
	
}
