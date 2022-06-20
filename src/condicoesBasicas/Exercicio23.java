package condicoesBasicas;

import java.util.Scanner;
import java.util.regex.Pattern;

// Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos para todos, mas especialmente para mulheres. Faça um programa que leia nome, sexo e o valor das compras do cliente e calcule o preço com desconto.

public class Exercicio23 {

	public Double exercicio23(String nome_exerc23 , char sexo_exerc23 , double preco_exerc23) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exercício 23 - Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos para todos, mas especialmente para mulheres. Faça um programa que leia nome, sexo e o valor das compras do cliente e calcule o preço com desconto.\n");
		
		System.out.println("Digite seu nome --> ");
		nome_exerc23 = input.nextLine();
		System.out.println("Digite seu sexo ('M' ou 'F') --> ");
		sexo_exerc23 = input.next(".").charAt(0);
		System.out.println("Digite valor das compras --> ");
		preco_exerc23 = input.nextDouble();
		
		if (sexo_exerc23 == 'F') {
			
			preco_exerc23 = preco_exerc23 - (preco_exerc23 * 0.13);
			
			System.out.printf("\nCLIENTE %s OBTEVE UM DESCONTO DE 13%%, VALOR FINAL: %.2fR$!\n", nome_exerc23, preco_exerc23);
			
		} else {
			
			preco_exerc23 = preco_exerc23 - (preco_exerc23 * 0.05);
			
			System.out.printf("\nCLIENTE %s OBTEVE UM DESCONTO DE 5%%, VALOR FINAL: %.2fR$!\n", nome_exerc23, preco_exerc23);
			
		}
		
		System.out.println("\n====================================================================================================================\n");
		
		return null;
	}
}