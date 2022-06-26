package condicoesCompostas;

import java.util.Scanner;

// Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia para carro de luxo. Além disso, o cliente paga por Km percorrido. Faça um programa que leia o tipo de carro alugado (popular ou luxo), quantos dias de aluguel e quantos Km foram percorridos. No final mostre o preço a ser pago.

public class Exercicio35 {
	
	public Double exercicio35(String tipoCarro_exerc35 , int diasAluguel_exerc35 , double km_exerc35) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exercício 35 - Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia para carro de luxo. Além disso, o cliente paga por Km percorrido. Faça um programa que leia o tipo de carro alugado (popular ou luxo), quantos dias de aluguel e quantos Km foram percorridos. No final mostre o preço a ser pago.\n");
		
		System.out.println("Por favor, informe o tipo de carro (popular OU luxo) --> ");
		tipoCarro_exerc35 = input.next();
		System.out.println("Por favor, informe quantos dias de aluguel --> ");
		diasAluguel_exerc35 = input.nextInt();
		System.out.println("Por favor, informe quantos KM foram percorridos --> ");
		km_exerc35 = input.nextDouble();
		
		if (tipoCarro_exerc35.equals("Popular")) {
			
			if (km_exerc35 <= 100) {
				
				double preco_exerc35 = 0;
				preco_exerc35 = (km_exerc35 * 0.20) + (diasAluguel_exerc35 * 90);
				
				System.out.println("\n\t----------=====CARRO POPULAR=====----------\n");
				System.out.printf("%.2fKM percorridos num período de %d dias. Valor a se pagar --> %.2fR$\n", km_exerc35, diasAluguel_exerc35, preco_exerc35);
				
			} else {
				
				double preco_exerc35 = 0;
				preco_exerc35 = (km_exerc35 * 0.10) + (diasAluguel_exerc35 * 90);
				
				System.out.println("\n\t----------=====CARRO POPULAR=====----------\n");
				System.out.printf("%.2fKM percorridos num período de %d dias. Valor a se pagar --> %.2fR$\n", km_exerc35, diasAluguel_exerc35, preco_exerc35);

			}
			
		} else {
			
			if (km_exerc35 <= 200) {
				
				double preco_exerc35 = 0;
				preco_exerc35 = (km_exerc35 * 0.30) + (diasAluguel_exerc35 * 150);
				
				System.out.println("\n\t----------=====CARRO DE LUXO=====----------\n");
				System.out.printf("%.2fKM percorridos num período de %d dias. Valor a se pagar --> %.2fR$\n", km_exerc35, diasAluguel_exerc35, preco_exerc35);
				
			} else {
				
				double preco_exerc35 = 0;
				preco_exerc35 = (km_exerc35 * 0.25) + (diasAluguel_exerc35 * 150);
				
				System.out.println("\n\t----------=====CARRO DE LUXO=====----------\n");
				System.out.printf("%.2fKM percorridos num período de %d dias. Valor a se pagar --> %.2fR$\n", km_exerc35, diasAluguel_exerc35, preco_exerc35);

			}

		}
		
		System.out.println("\n====================================================================================================================\n");
		
		return null;
	}
}