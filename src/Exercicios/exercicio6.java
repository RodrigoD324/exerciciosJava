package Exercicios;

import java.util.Scanner;

// Faça um programa que leia um número inteiro e mostre o seu sucessor e seu antecessor.
public class exercicio6 {
	
	public int Exercicio6(int num_exerc6 , int sucessor_exerc6 , int antecessor_exerc6) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exercício 6 - Faça um programa que leia um número inteiro e mostre o seu sucessor e seu antecessor.\n");
		
		System.out.println("Digite um número inteiro qualquer --> ");
		num_exerc6 = input.nextInt();
		
		sucessor_exerc6 = num_exerc6 + 1;
		antecessor_exerc6 = num_exerc6 - 1;
		
		System.out.printf("O sucessor de %d é %d\n", num_exerc6, sucessor_exerc6);
		System.out.printf("O antecessor de %d é %d\n", num_exerc6, antecessor_exerc6);
		
		System.out.println("\n====================================================================================================================\n");
		
		return 0;
	}
	
}
