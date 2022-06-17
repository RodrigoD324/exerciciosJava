package Exercicios;

import java.util.Scanner;

//Faça um programa que leia as duas notas de um aluno em uma matéria e mostre na tela a sua média na disciplina.

public class exercicio5 {
	
	public Double Exercicio5(double nota1_exerc5 , double nota2_exerc5 , double media_exerc5) {
	
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exercício 5 - Faça um programa que leia as duas notas de um aluno em uma matéria e mostre na tela a sua média na disciplina.\n");
		
		System.out.println("Digite Nota 1 --> ");
		nota1_exerc5 = input.nextDouble();
		System.out.println("Digite Nota 2 --> ");
		nota2_exerc5 = input.nextDouble();
		
		media_exerc5 = (nota1_exerc5 + nota2_exerc5) / 2;
		
		System.out.printf("A média entre %.1f e %.1f é igual a %.1f.\n", nota1_exerc5, nota2_exerc5, media_exerc5);
		
		System.out.println("\n====================================================================================================================\n");
		
		return null;
	}

}
