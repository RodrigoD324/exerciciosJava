package Exercicios;

import java.util.Scanner;

// Fa�a um programa que leia um n�mero inteiro e mostre o seu sucessor e seu antecessor.
public class exercicio6 {
	
	public int Exercicio6(int num_exerc6 , int sucessor_exerc6 , int antecessor_exerc6) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exerc�cio 6 - Fa�a um programa que leia um n�mero inteiro e mostre o seu sucessor e seu antecessor.\n");
		
		System.out.println("Digite um n�mero inteiro qualquer --> ");
		num_exerc6 = input.nextInt();
		
		sucessor_exerc6 = num_exerc6 + 1;
		antecessor_exerc6 = num_exerc6 - 1;
		
		System.out.printf("O sucessor de %d � %d\n", num_exerc6, sucessor_exerc6);
		System.out.printf("O antecessor de %d � %d\n", num_exerc6, antecessor_exerc6);
		
		System.out.println("\n====================================================================================================================\n");
		
		return 0;
	}
	
}
