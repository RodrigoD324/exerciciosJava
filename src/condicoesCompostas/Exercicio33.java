package condicoesCompostas;

import java.util.Scanner;

//Escreva um programa para aprovar ou não o empréstimo bancário para a compra de uma casa. O programa vai perguntar o valor da casa, o salário do comprador e em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que ela não pode exceder 30% do salário ou então o empréstimo será negado.

public class Exercicio33 {

	public Double exercicio33(double valorCasa_exerc33 , double salario_exerc33 , int anos_exerc33) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exercício 33 - Escreva um programa para aprovar ou não o empréstimo bancário para a compra de uma casa. O programa vai perguntar o valor da casa, o salário do comprador e em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que ela não pode exceder 30% do salário ou então o empréstimo será negado.\n");
		
		System.out.println("Por favor, informe o valor da casa --> ");
		valorCasa_exerc33 = input.nextDouble();
		System.out.println("Por favor, informe o valor de seu salário --> ");
		salario_exerc33 = input.nextDouble();
		System.out.println("Por favor, informe em quantos anos você irá pagar --> ");
		anos_exerc33 = input.nextInt();
		
		
		
		return null;
	}
	
}
