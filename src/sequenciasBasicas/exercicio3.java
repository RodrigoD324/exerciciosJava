package sequenciasBasicas;

import java.util.Scanner;

// Crie um programa que leia o nome e o salário de um funcionário, mostrando no final uma mensagem.

public class exercicio3 {
	
	public Void Exercicio3(String nome_exerc3 , double salario_exerc3) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Exercício 3 - Crie um programa que leia o nome e o salário de um funcionário, mostrando no final uma mensagem.\n");
		
		System.out.println("Qual seu nome? --> ");
		nome_exerc3 = input.nextLine();
		System.out.println("Qual seu salário: --> ");
		salario_exerc3 = input.nextDouble();
		
		System.out.printf("\nNome do Funcionário: %s", nome_exerc3);
		System.out.printf("\nSalário: R$%.2f", salario_exerc3);
		
		System.out.printf("\nO funcionário %s tem um salário de R$%.2f por mês.\n", nome_exerc3, salario_exerc3);
		
		System.out.println("\n====================================================================================================================\n");

		return null;
	}
}
