package Exercicios;

import java.util.Scanner;

// Crie um programa que leia o n�mero de dias trabalhados em um m�s e mostre o sal�rio de um funcion�rio, sabendo que ele trabalha 8 horas por dia e ganha R$25 por hora trabalhada.

public class exercicio15 {

	public Double Exercicio15(int dias_exerc15 , double salario_exerc15) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exerc�cio 15 - Crie um programa que leia o n�mero de dias trabalhados em um m�s e mostre o sal�rio de um funcion�rio, sabendo que ele trabalha 8 horas por dia e ganha R$25 por hora trabalhada.\n");
		
		System.out.println("Digite quantidade de dias trabalhados no m�s --> ");
		dias_exerc15 = input.nextInt();
		
		salario_exerc15 = (25 * 8) * dias_exerc15;
		
		System.out.printf("\nSal�rio no final do m�s --> %.2fR$\n", salario_exerc15);
		
		System.out.println("\n====================================================================================================================\n");
		
		return null;
	}
	
}