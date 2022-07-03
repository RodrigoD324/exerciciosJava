package repeticoesEnquanto;

import java.util.Scanner;

// Vamos melhorar o jogo que fizemos no exerc�cio 32. A partir de agora, o computador vai sortear um n�mero entre 1 e 10 e o jogador vai ter 4 tentativas para tentar acertar.


public class Exercicio55 {

	public Double exercicio55 (double numero_exerc55) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.printf("Exerc�cio 55 - Vamos melhorar o jogo que fizemos no exerc�cio 32. A partir de agora, o computador vai sortear um n�mero entre 1 e 10 e o jogador vai ter 4 tentativas para tentar acertar.\n\n");
		
		int auxiliar_exerc55 = 1;
		int tentativas_exerc55 = 1;
		int tentativasRestantes_exerc55 = 3;
		double contagem_exerc55 = 0;
		
		while (auxiliar_exerc55 < 21) {
			
			contagem_exerc55 = contagem_exerc55 + 0.5;
			System.out.printf("%.1f  ", contagem_exerc55);
			
			auxiliar_exerc55++;
		}
		
		System.out.printf("\n\nDentro da sequ�ncia acima, h� apenas um n�mero certo, voc� tem 4 tentativas para tentar acert�-lo!\n\n");
		
		while (tentativas_exerc55 < 5) {
			
			System.out.printf("%d� Tentativa - Informe n�mero de sua escolha --> ", tentativas_exerc55);
			numero_exerc55 = input.nextDouble();
			
			if (numero_exerc55 == 5.5) {
				
				System.out.printf("\nBooa! Op��o correta! :)");
				
				tentativas_exerc55 = 5;
			} else {
				
				if (numero_exerc55 == 0.5 || numero_exerc55 == 1.0 || numero_exerc55 == 1.5 || numero_exerc55 == 2.0 || numero_exerc55 == 2.5 || numero_exerc55 == 3.0 || numero_exerc55 == 3.5 || numero_exerc55 == 4.0 || numero_exerc55 == 4.5 || numero_exerc55 == 5.0 || numero_exerc55 == 6.0 || numero_exerc55 == 6.5 || numero_exerc55 == 7.0 || numero_exerc55 == 7.5 || numero_exerc55 == 8.0 || numero_exerc55 == 8.5 || numero_exerc55 == 9.0 || numero_exerc55 == 9.5 || numero_exerc55 == 10.0) {
					
					if (tentativas_exerc55 == 4) {
						System.out.println("\nN�o foi dessa vez :(");
					} else {
						System.out.println("\nOps! Op��o errada! :(\n");
						System.out.printf("Tentativas restantes: %d\n\n", tentativasRestantes_exerc55--);
					}
					
					tentativas_exerc55++;
				} else {

					System.out.println("\nCalma l�, amig�o! Selecione um n�mero entre 0.5 e 10.0! :|\n");
					
				}

			}
			
		}
		
		return null;
	}
}