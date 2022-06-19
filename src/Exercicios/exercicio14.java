package Exercicios;

import java.util.Scanner;

//A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva um programa que pergunte a quantidade de Km percorridos por um carro alugado e a quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar, sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.

public class exercicio14 {

	public Double Exercicio14(double km_exerc14 , int dias_exerc14 , double total_exerc14) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exercício 14 - A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva um programa que pergunte a quantidade de Km percorridos por um carro alugado e a quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar, sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.\n");
		
		System.out.println("Digite a quantidade de Km percorridos pelo carro alugado --> ");
		km_exerc14 = input.nextDouble();
		System.out.println("Digite a quantidade de dias pelos quais ele foi alugado --> ");
		dias_exerc14 = input.nextInt();
		
		total_exerc14 = (dias_exerc14 * 90) + (km_exerc14 * 0.2);
		
		System.out.printf("\nO preço total a se pagar pelo carro alugado é igual a --> %.2fR$\n", total_exerc14);
		
		System.out.println("\n====================================================================================================================\n");
		
		return null;
	}
	
}