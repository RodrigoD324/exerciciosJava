package condicoesCompostas;

import java.util.Scanner;

// Uma empresa precisa reajustar o sal�rio dos seus funcion�rios, dando um aumento de acordo com alguns fatores. Fa�a um programa que leia o sal�rio atual, o g�nero do funcion�rio e h� quantos anos esse funcion�rio trabalha na empresa.

public class Exercicio37 {
	
	public Double exercicio37(double salario_exerc37 , String genero_exerc37 , int anos_exerc37) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exerc�cio 37 - Uma empresa precisa reajustar o sal�rio dos seus funcion�rios, dando um aumento de acordo com alguns fatores. Fa�a um programa que leia o sal�rio atual, o g�nero do funcion�rio e h� quantos anos esse funcion�rio trabalha na empresa.\n");
		
		System.out.println("Por favor, informe seu g�nero (masculino OU feminino) **APENAS LETRAS MIN�SCULAS** --> ");
		genero_exerc37 = input.next();
		System.out.println("Por favor, informe seu sal�rio atual --> ");
		salario_exerc37 = input.nextDouble();
		System.out.println("Por favor, informe h� quantos anos trabalha na empresa --> ");
		anos_exerc37 = input.nextInt();
		
		if (genero_exerc37.equals("feminino")) {
			
			if (anos_exerc37 < 15) {
				
				double novoSalario_exerc37 = 0;
				novoSalario_exerc37 = (salario_exerc37 * 0.05) + salario_exerc37;
				
				System.out.printf("\nFuncion�ria com %d anos de empresa.\n", anos_exerc37);
				System.out.printf("\nAumento de 5%% | Sal�rio antigo --> %.2fR$ | Sal�rio novo --> %.2fR$\n", salario_exerc37, novoSalario_exerc37);
				
			} else {
				
				if (anos_exerc37 >= 15 && anos_exerc37 <= 20) {
					
					double novoSalario_exerc37 = 0;
					novoSalario_exerc37 = (salario_exerc37 * 0.12) + salario_exerc37;
					
					System.out.printf("\nFuncion�ria com %d anos de empresa.\n", anos_exerc37);
					System.out.printf("\nAumento de 12%% | Sal�rio antigo --> %.2fR$ | Sal�rio novo --> %.2fR$\n", salario_exerc37, novoSalario_exerc37);
					
				} else {
					
					double novoSalario_exerc37 = 0;
					novoSalario_exerc37 = (salario_exerc37 * 0.23) + salario_exerc37;
					
					System.out.printf("\nFuncion�ria com %d anos de empresa.\n", anos_exerc37);
					System.out.printf("\nAumento de 23%% | Sal�rio antigo --> %.2fR$ | Sal�rio novo --> %.2fR$\n", salario_exerc37, novoSalario_exerc37);

				}

			}
			
		} else {
			
			if (anos_exerc37 < 20) {
				
				double novoSalario_exerc37 = 0;
				novoSalario_exerc37 = (salario_exerc37 * 0.03) + salario_exerc37;
				
				System.out.printf("\nFuncion�rio com %d anos de empresa.\n", anos_exerc37);
				System.out.printf("\nAumento de 3%% | Sal�rio antigo --> %.2fR$ | Sal�rio novo --> %.2fR$\n", salario_exerc37, novoSalario_exerc37);
				
			} else {
				
				if (anos_exerc37 >= 20 && anos_exerc37 <= 30) {
					
					double novoSalario_exerc37 = 0;
					novoSalario_exerc37 = (salario_exerc37 * 0.13) + salario_exerc37;
					
					System.out.printf("\nFuncion�rio com %d anos de empresa.\n", anos_exerc37);
					System.out.printf("\nAumento de 13%% | Sal�rio antigo --> %.2fR$ | Sal�rio novo --> %.2fR$\n", salario_exerc37, novoSalario_exerc37);
					
				} else {
					
					double novoSalario_exerc37 = 0;
					novoSalario_exerc37 = (salario_exerc37 * 0.25) + salario_exerc37;
					
					System.out.printf("\nFuncion�rio com %d anos de empresa.\n", anos_exerc37);
					System.out.printf("\nAumento de 25%% | Sal�rio antigo --> %.2fR$ | Sal�rio novo --> %.2fR$\n", salario_exerc37, novoSalario_exerc37);

				}

			}

		}
		
		System.out.println("\n====================================================================================================================\n");
		
		return null;
	}
}