package sequenciasBasicas;

import java.util.Scanner;

//Fa�a um algoritmo que leia o sal�rio de um funcion�rio, calcule e mostre o seu novo sal�rio, com 15% de aumento.

public class exercicio13 {

	public Double Exercicio13(double salario_exerc13 , double porcentagem_exerc13) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exerc�cio 13 - Fa�a um algoritmo que leia o sal�rio de um funcion�rio, calcule e mostre o seu novo sal�rio, com 15% de aumento.\n");
		
		System.out.println("Digite o sal�rio atual --> ");
		salario_exerc13 = input.nextDouble();
		System.out.println("Digite a porcentagem de aumento --> ");
		porcentagem_exerc13 = input.nextDouble();
		
		porcentagem_exerc13 = (porcentagem_exerc13 / 100) * salario_exerc13;
		
		salario_exerc13 = porcentagem_exerc13 + salario_exerc13;
		
		System.out.printf("\nNovo sal�rio com aumento acrescentado igual a --> %.1fR$\n", salario_exerc13);
		
		System.out.println("\n====================================================================================================================\n");
		
		return null;
	}
	
}