package Exercicios;

import java.util.Scanner;

// Crie um programa que leia o número de dias trabalhados em um mês e mostre o salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25 por hora trabalhada.

public class exercicio15 {

	public Double Exercicio15(int dias_exerc15 , double salario_exerc15) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exercício 15 - Crie um programa que leia o número de dias trabalhados em um mês e mostre o salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25 por hora trabalhada.\n");
		
		System.out.println("Digite quantidade de dias trabalhados no mês --> ");
		dias_exerc15 = input.nextInt();
		
		salario_exerc15 = (25 * 8) * dias_exerc15;
		
		System.out.printf("\nSalário no final do mês --> %.2fR$\n", salario_exerc15);
		
		System.out.println("\n====================================================================================================================\n");
		
		return null;
	}
	
}