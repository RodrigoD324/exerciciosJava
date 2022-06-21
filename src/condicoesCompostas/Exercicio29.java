package condicoesCompostas;

import java.util.Scanner;

//Desenvolva um programa que leia o nome de um funcionário, seu salário, quantos anos ele trabalha na empresa e mostre seu novo salário

public class Exercicio29 {

	public Double exercicio29(String nome_exerc29 , double salario_exerc29 , int anos_exerc29 , double novoSalario_exerc29) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exercício 29 - Desenvolva um programa que leia o nome de um funcionário, seu salário, quantos anos ele trabalha na empresa e mostre seu novo salário.\n");
		
		System.out.println("Por favor, digite seu nome completo --> ");
		nome_exerc29 = input.nextLine();
		System.out.println("Por favor, digite seu salário atual --> ");
		salario_exerc29 = input.nextDouble();
		System.out.println("Por favor, digite há quantos anos trabalha nesta empresa --> ");
		anos_exerc29 = input.nextInt();
		
		if (anos_exerc29 <= 3) {
			
			novoSalario_exerc29 = (0.03 * salario_exerc29) + salario_exerc29;
			
			System.out.printf("\nFUNCIONÁRIO: %s COM %d ANOS DE EMPRESA!  SALÁRIO ANTIGO: %.2fR$  SALÁRIO NOVO COM 3%% DE AUMENTO: %.2fR$\n", nome_exerc29, anos_exerc29, salario_exerc29, novoSalario_exerc29);
			
		} else {
			
			if (anos_exerc29 >= 10) {
				
				novoSalario_exerc29 = (0.2 * salario_exerc29) + salario_exerc29;
				
				System.out.printf("\nFUNCIONÁRIO: %s COM %d ANOS DE EMPRESA!  SALÁRIO ANTIGO: %.2fR$  SALÁRIO NOVO COM 20%% DE AUMENTO: %.2fR$\n", nome_exerc29, anos_exerc29, salario_exerc29, novoSalario_exerc29);
				
			} else {
				
				novoSalario_exerc29 = (0.125 * salario_exerc29) + salario_exerc29;
				
				System.out.printf("\nFUNCIONÁRIO: %s COM %d ANOS DE EMPRESA!  SALÁRIO ANTIGO: %.2fR$  SALÁRIO NOVO COM 12,5%% DE AUMENTO: %.2fR$\n", nome_exerc29, anos_exerc29, salario_exerc29, novoSalario_exerc29);

			}
		}
		
		System.out.println("\n====================================================================================================================\n");
		
		return null;
	}
}