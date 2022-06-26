package condicoesCompostas;

import java.util.Scanner;

//Escreva um programa para aprovar ou não o empréstimo bancário para a compra de uma casa. O programa vai perguntar o valor da casa, o salário do comprador e em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que ela não pode exceder 30% do salário ou então o empréstimo será negado.

public class Exercicio33 {

	public Double exercicio33(double valorCasa_exerc33 , double salario_exerc33 , int meses_exerc33, double valorPrestacao_exerc33) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exercício 33 - Escreva um programa para aprovar ou não o empréstimo bancário para a compra de uma casa. O programa vai perguntar o valor da casa, o salário do comprador e em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que ela não pode exceder 30% do salário ou então o empréstimo será negado.\n");
		
		System.out.println("Por favor, informe o valor da casa --> ");
		valorCasa_exerc33 = input.nextDouble();
		System.out.println("Por favor, informe o valor de seu salário --> ");
		salario_exerc33 = input.nextDouble();
		System.out.println("Por favor, informe em quantos meses você irá pagar --> ");
		meses_exerc33 = input.nextInt();
		
		valorPrestacao_exerc33 = (0.015 / (1 - Math.pow((1 + 0.015) , - meses_exerc33))) * valorCasa_exerc33;
		
		double porcentagem_exerc33 = 0;
		porcentagem_exerc33 = 0.3 * salario_exerc33;
		
		if (valorPrestacao_exerc33 > porcentagem_exerc33) {
			
			System.out.printf("\nEmpréstimo negado, pois o valor prestação mensal --> %.2f\nUltrapassa 30%% do valor salário --> %.2f\n", valorPrestacao_exerc33, porcentagem_exerc33);
			
		} else {
			
			System.out.printf("\nEmpréstimo aprovado, pois o valor prestação mensal --> %.2f\nNão ultrapassa 30%% do valor salário --> %.2f\n", valorPrestacao_exerc33, porcentagem_exerc33);
			
		}
		
		System.out.println("\n====================================================================================================================\n");
		
		return null;
	}
}