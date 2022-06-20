package sequenciasBasicas;

import java.util.Scanner;

//Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o seu novo salário, com 15% de aumento.

public class exercicio13 {

	public Double Exercicio13(double salario_exerc13 , double porcentagem_exerc13) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exercício 13 - Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o seu novo salário, com 15% de aumento.\n");
		
		System.out.println("Digite o salário atual --> ");
		salario_exerc13 = input.nextDouble();
		System.out.println("Digite a porcentagem de aumento --> ");
		porcentagem_exerc13 = input.nextDouble();
		
		porcentagem_exerc13 = (porcentagem_exerc13 / 100) * salario_exerc13;
		
		salario_exerc13 = porcentagem_exerc13 + salario_exerc13;
		
		System.out.printf("\nNovo salário com aumento acrescentado igual a --> %.1fR$\n", salario_exerc13);
		
		System.out.println("\n====================================================================================================================\n");
		
		return null;
	}
	
}