package condicoesCompostas;

import java.util.Scanner;

//Escreva um programa para aprovar ou n�o o empr�stimo banc�rio para a compra de uma casa. O programa vai perguntar o valor da casa, o sal�rio do comprador e em quantos anos ele vai pagar. Calcule o valor da presta��o mensal, sabendo que ela n�o pode exceder 30% do sal�rio ou ent�o o empr�stimo ser� negado.

public class Exercicio33 {

	public Double exercicio33(double valorCasa_exerc33 , double salario_exerc33 , int meses_exerc33, double valorPrestacao_exerc33) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exerc�cio 33 - Escreva um programa para aprovar ou n�o o empr�stimo banc�rio para a compra de uma casa. O programa vai perguntar o valor da casa, o sal�rio do comprador e em quantos anos ele vai pagar. Calcule o valor da presta��o mensal, sabendo que ela n�o pode exceder 30% do sal�rio ou ent�o o empr�stimo ser� negado.\n");
		
		System.out.println("Por favor, informe o valor da casa --> ");
		valorCasa_exerc33 = input.nextDouble();
		System.out.println("Por favor, informe o valor de seu sal�rio --> ");
		salario_exerc33 = input.nextDouble();
		System.out.println("Por favor, informe em quantos meses voc� ir� pagar --> ");
		meses_exerc33 = input.nextInt();
		
		valorPrestacao_exerc33 = (0.015 / (1 - Math.pow((1 + 0.015) , - meses_exerc33))) * valorCasa_exerc33;
		
		double porcentagem_exerc33 = 0;
		porcentagem_exerc33 = 0.3 * salario_exerc33;
		
		if (valorPrestacao_exerc33 > porcentagem_exerc33) {
			
			System.out.printf("\nEmpr�stimo negado, pois o valor presta��o mensal --> %.2f\nUltrapassa 30%% do valor sal�rio --> %.2f\n", valorPrestacao_exerc33, porcentagem_exerc33);
			
		} else {
			
			System.out.printf("\nEmpr�stimo aprovado, pois o valor presta��o mensal --> %.2f\nN�o ultrapassa 30%% do valor sal�rio --> %.2f\n", valorPrestacao_exerc33, porcentagem_exerc33);
			
		}
		
		System.out.println("\n====================================================================================================================\n");
		
		return null;
	}
}