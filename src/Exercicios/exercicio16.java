package Exercicios;

import java.util.Scanner;

//Escreva um programa para calcular a redu��o do tempo de vida de um fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele j� fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule quantos dias de vida um fumante perder� e exiba o total em dias.

public class exercicio16 {
	
	public int Exercicio16(int cigarros_exerc16 , int anos_exerc16 , int diasTotal_exerc16 , int cigarrosTotal_exerc16 , int minutos_exerc16 , int diasPerdidos_exerc16) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exerc�cio 16 - Escreva um programa para calcular a redu��o do tempo de vida de um fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele j� fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule quantos dias de vida um fumante perder� e exiba o total em dias.\n");
		
		System.out.println("Digite a quantidade de cigarros fumados por dia --> ");
		cigarros_exerc16 = input.nextInt();
		System.out.println("Digite a quantidade de anos fumando --> ");
		anos_exerc16 = input.nextInt();
		
		diasTotal_exerc16 = anos_exerc16 * 365;
		
		cigarrosTotal_exerc16 = diasTotal_exerc16 * cigarros_exerc16;
		
		minutos_exerc16 = cigarrosTotal_exerc16 * 10;
		
		diasPerdidos_exerc16 = minutos_exerc16 / 1440;
		
		System.out.printf("\nSabendo que a quantidade de cigarros fumados por dia em m�dia s�o %d, num per�odo de %d anos. Obtemos os resultados a seguir: \n", cigarros_exerc16 , anos_exerc16);
		
		System.out.printf("\n%d anos convertidos em dias s�o iguais a --> %d Dias", anos_exerc16, diasTotal_exerc16);
		System.out.printf("\nMantendo a m�dia de %d cigarros por dia, num per�odo de %d dias. O n�mero de cigarros no total s�o de --> %d Cigarros", cigarros_exerc16, diasTotal_exerc16, cigarrosTotal_exerc16);
		System.out.printf("\nLevando em considera��o que a cada cigarro o fumante perde 10 minutos de vida, o total de minutos perdidos s�o de --> %d Minutos\n", minutos_exerc16);
		System.out.printf("\nConvetendo os minutos em dias, temos um total de %d dias de vida perdidos.\n", diasPerdidos_exerc16);
		
		System.out.println("\n====================================================================================================================\n");
		
		return 0;
	}

}