package condicoesCompostas;

import java.util.Scanner;

// O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura e no peso de uma pessoa. De acordo com o valor do IMC, podemos classificar o indivíduo dentro de certas faixas.


public class Exercicio34 {
	
	public Double exercicio34(double peso_exerc34 , double altura_exerc34) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exercício 34 - O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura e no peso de uma pessoa. De acordo com o valor do IMC, podemos classificar o indivíduo dentro de certas faixas.\n");
		
		System.out.println("Por favor, informe seu peso --> ");
		peso_exerc34 = input.nextDouble();
		System.out.println("Por favor, informe sua altura --> ");
		altura_exerc34 = input.nextDouble();
		
		double imc_exerc34 = 0;
		imc_exerc34 = peso_exerc34 / Math.pow(altura_exerc34, 2);
		
		if (imc_exerc34 < 18.5) {
			
			System.out.printf("\nIMC --> %.2f", imc_exerc34);
			System.out.printf("\nAbaixo de %.2f: Abaixo do Peso!", imc_exerc34);
			
		} else {
			
			if (imc_exerc34 >= 18.5 && imc_exerc34 <= 25) {
				
				System.out.printf("\nIMC --> %.2f", imc_exerc34);
				System.out.println("\nEntre 18.5 e 25: Peso ideal!");
				
			} else {
				
				if (imc_exerc34 > 25 && imc_exerc34 <= 30) {
					
					System.out.printf("\nIMC --> %.2f", imc_exerc34);
					System.out.println("\nEntre 25 e 30: Sobrepeso!");
					
				} else {
					
					if (imc_exerc34 > 30 && imc_exerc34 <= 40) {
						
						System.out.printf("\nIMC --> %.2f", imc_exerc34);
						System.out.println("\nEntre 30 e 40: Obesidade!");
						
					} else {
						
						System.out.printf("\nIMC --> %.2f", imc_exerc34);
						System.out.println("\nAcima de 40: Obesidade Mórbida!!");

					}

				}

			}

		}
		
		System.out.println("\n====================================================================================================================\n");
		
		return null;
	}
}