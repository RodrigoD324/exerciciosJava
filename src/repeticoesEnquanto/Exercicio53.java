package repeticoesEnquanto;

import java.util.Scanner;

//Faça um programa que leia a idade e o sexo de 5 pessoas, mostrando no final

public class Exercicio53 {

	public int exercicio53(int idade_exerc53 , String sexo_exerc53) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.printf("Exercício 53 - Faça um programa que leia a idade e o sexo de 5 pessoas, mostrando no final.\n\n");
		
		int auxiliar_exerc53 = 1;
		int homensCadastrados_exerc53 = 0;
		int mulheresCadastradas_exerc53 = 0;
		int mediaIdadeHomens_exerc53 = 0;
		int mediaIdadeGrupo_exerc53 = 0;
		int mulheresComMaisDe20Anos_exerc53 = 0;
		
		while (auxiliar_exerc53 < 6) {
			
			System.out.printf("%dº Pessoa - Informe seu sexo ('Masculino' ou 'Feminino') --> ", auxiliar_exerc53);
			sexo_exerc53 = input.next();
			System.out.printf("\t  - Informe sua idade --> ", auxiliar_exerc53);
			idade_exerc53 = input.nextInt();
			System.out.println("");
			
			mediaIdadeGrupo_exerc53 += idade_exerc53;
			
			if (sexo_exerc53.equals("Masculino")) {
				homensCadastrados_exerc53++;
				mediaIdadeHomens_exerc53 += idade_exerc53;
			}
			if (sexo_exerc53.equals("Feminino")) {
				mulheresCadastradas_exerc53++;
				
				if (idade_exerc53 > 20) {
					mulheresComMaisDe20Anos_exerc53++;
				}
			}
			
			auxiliar_exerc53++;
		}
		
		mediaIdadeGrupo_exerc53 = mediaIdadeGrupo_exerc53 / 5;
		mediaIdadeHomens_exerc53 = mediaIdadeHomens_exerc53 / homensCadastrados_exerc53;
		
		System.out.printf("\nForam cadastrados %d homens.", homensCadastrados_exerc53);
		System.out.printf("\nForam cadastradas %d mulheres.", mulheresCadastradas_exerc53);
		System.out.printf("\nA média de idade do grupo é igual --> %d", mediaIdadeGrupo_exerc53);
		System.out.printf("\nA média de idade dos homens é igual --> %d", mediaIdadeHomens_exerc53);
		System.out.printf("\nExistem %d mulheres com mais de 20 anos de idade.", mulheresComMaisDe20Anos_exerc53);
		
		System.out.printf("\n\n====================================================================================================================\n");
		
		return 0;
	}	
}