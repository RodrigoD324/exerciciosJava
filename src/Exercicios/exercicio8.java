package Exercicios;

import java.util.Scanner;

//Desenvolva um programa que leia uma dist�ncia em metros e mostre os valores relativos em outras medidas.

public class exercicio8 {
	
	public Double Exercicio8(double distancia_exerc8 , double km_exerc8 , double hm_exerc8 , double dam_exerc8 , double dm_exerc8 , double cm_exerc8 , double mm_exerc8) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exerc�cio 8 - Desenvolva um programa que leia uma dist�ncia em metros e mostre os valores relativos em outras medidas.\n");
		
		System.out.println("Digite uma dist�ncia em metros --> ");
		distancia_exerc8 = input.nextDouble();
		
		km_exerc8 = distancia_exerc8 / 1000;
		hm_exerc8 = distancia_exerc8 / 100;
		dam_exerc8 = distancia_exerc8 / 10;
		dm_exerc8 = distancia_exerc8 * 10;
		cm_exerc8 = distancia_exerc8 * 100;
		mm_exerc8 = distancia_exerc8 * 1000;
		
		System.out.printf("\nA dist�ncia de %.2fm corresponde aos seguintes valores: \n", distancia_exerc8);
		
		System.out.printf("%.5fKm\n", km_exerc8);
		System.out.printf("%.4fHm\n", hm_exerc8);
		System.out.printf("%.3fDam\n", dam_exerc8);
		System.out.printf("%.1fdm\n", dm_exerc8);
		System.out.printf("%.1fcm\n", cm_exerc8);
		System.out.printf("%.1fmm\n", mm_exerc8);
		
		System.out.println("\n====================================================================================================================\n");
		
		return null;
	}

}
