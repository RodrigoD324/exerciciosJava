package repeticoesEnquanto;

import java.util.Scanner;

// Desenvolva um aplicativo que leia o peso e a altura de 7 pessoas, mostrando no final.

public class Exercicio54 {

	public Double exercicio54(double peso_exerc54 , double altura_exerc54) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.printf("Exercício 54 - Desenvolva um aplicativo que leia o peso e a altura de 7 pessoas, mostrando no final.\n\n");
		
		int auxiliar_exerc54 = 1;
		double mediaAlturaGrupo_exerc54 = 0;
		int pessoasPesoAcima90KG_exerc54 = 0;
		int pessoasComPesoMenos50KGComMenos160Altura_exerc54 = 0;
		int pessoasComAlturaAcima190ComPesoAcima100KG_exerc54 = 0;
		
		while (auxiliar_exerc54 < 8) {
			
			System.out.printf("%dº Pessoa - Informe seu peso --> ", auxiliar_exerc54);
			peso_exerc54 = input.nextDouble();
			System.out.printf("\t  - Informe sua altura --> ", auxiliar_exerc54);
			altura_exerc54 = input.nextDouble();
			System.out.println("");
			
			mediaAlturaGrupo_exerc54 += altura_exerc54;

			if (peso_exerc54 > 90) {
				pessoasPesoAcima90KG_exerc54++;
			}
			if (peso_exerc54 < 50) {
				if (altura_exerc54 < 1.60) {
					pessoasComPesoMenos50KGComMenos160Altura_exerc54++;
				}
			}
			if (altura_exerc54 > 1.90) {
				if (peso_exerc54 > 100) {
					pessoasComAlturaAcima190ComPesoAcima100KG_exerc54++;
				}
			}
			auxiliar_exerc54++;
		}
		
		mediaAlturaGrupo_exerc54 = mediaAlturaGrupo_exerc54 / 7;
		
		System.out.printf("\nA média de altura do grupo é igual a --> %.2f", mediaAlturaGrupo_exerc54);
		System.out.printf("\nExistem %d pessoas com peso acima de 90KG.", pessoasPesoAcima90KG_exerc54);
		System.out.printf("\nExistem %d pessoas que pesam menos de 50KG e tem menos de 1.60M.", pessoasComPesoMenos50KGComMenos160Altura_exerc54);
		System.out.printf("\nExistem %d pessoas que medem mais de 1.90M e pesam mais de 100KG.", pessoasComAlturaAcima190ComPesoAcima100KG_exerc54);
		
		System.out.printf("\n\n====================================================================================================================\n");

		return null;
	}	
}