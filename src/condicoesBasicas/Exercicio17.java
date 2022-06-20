package condicoesBasicas;

import java.util.Scanner;

//Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse 80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.

public class Exercicio17 {
	
	public Double exercicio17(int velocidade_exerc17 , double multa_exerc17) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Exercício 17 - Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse 80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.\n");
		
		System.out.println("Digite a velocidade do carro --> ");
		velocidade_exerc17 = input.nextInt();
		
		if (velocidade_exerc17 > 80) {
			
			multa_exerc17 = velocidade_exerc17 * 5;
			
			System.out.printf("\nVELOCIDADE LIMITE DE 80KM/H ULTRAPASSADA. VELOCIDADE EM QUE O INDIVÍDUO ESTAVA --> %dKM/H", velocidade_exerc17);
			System.out.printf("\nMULTA COM O VALOR DE --> %.2fR$\n", multa_exerc17);
			
		} else {
			
			System.out.printf("\nVELOCIDADE LIMITE DE 80KM RESPEITADA. VELOCIDADE EM QUE O INDIVÍDUO ESTAVA --> %dKM/H\n", velocidade_exerc17);
			
		}
		
		System.out.println("\n====================================================================================================================\n");
				
		return null;
	}

}