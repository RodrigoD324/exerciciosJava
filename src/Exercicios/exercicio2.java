package Exercicios;

import java.util.Scanner;

//Fa�a um programa que leia o nome de uma pessoa e mostre uma mensagem de boas vindas para ela

public class exercicio2 {
	
	public String Exercicio2(String nome_exerc2) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Exerc�cio 2 - Fa�a um programa que leia o nome de uma pessoa e mostre uma mensagem de boas vindas para ela.\n");
		
		System.out.println("Ol�! Qual seu nome?");
		nome_exerc2 = input.nextLine();
		System.out.printf("Ol� %s! Prazer te conhecer!\n", nome_exerc2);
		
		System.out.println("\n====================================================================================================================\n");
		
		return null;
	}

}
