package sequenciasBasicas;

import java.util.Scanner;

// Crie um programa que leia o nome e o sal�rio de um funcion�rio, mostrando no final uma mensagem.

public class exercicio3 {
	
	public Void Exercicio3(String nome_exerc3 , double salario_exerc3) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Exerc�cio 3 - Crie um programa que leia o nome e o sal�rio de um funcion�rio, mostrando no final uma mensagem.\n");
		
		System.out.println("Qual seu nome? --> ");
		nome_exerc3 = input.nextLine();
		System.out.println("Qual seu sal�rio: --> ");
		salario_exerc3 = input.nextDouble();
		
		System.out.printf("\nNome do Funcion�rio: %s", nome_exerc3);
		System.out.printf("\nSal�rio: R$%.2f", salario_exerc3);
		
		System.out.printf("\nO funcion�rio %s tem um sal�rio de R$%.2f por m�s.\n", nome_exerc3, salario_exerc3);
		
		System.out.println("\n====================================================================================================================\n");

		return null;
	}
}
