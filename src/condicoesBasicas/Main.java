package condicoesBasicas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		//variáveis necessárias para realização do exercício 17
		int velocidade_exerc17 = 0;
		double multa_exerc17 = 0;
		//chamado da classe, objeto e dos devidos métodos para realização do exercício 17
		Exercicio17 exercicio17 = new Exercicio17();
		Double resultadoExerc17 = exercicio17.exercicio17(velocidade_exerc17, multa_exerc17);
		
		//variáveis necessárias para realização do exercício 18
		int ano_exerc18 = 0;
		int idade_exerc18 = 0;
		//chamado da classe, objeto e dos devidos métodos para realização do exercício 18
		Exercicio18 exercicio18 = new Exercicio18();
		int resultadoExerc18 = exercicio18.exercicio18(ano_exerc18, idade_exerc18);
		
		//variáveis necessárias para realização do exercício 19
		double nota1_exerc19 = 0;
		double nota2_exerc19 = 0;
		double media_exerc19 = 0;
		String nome_exerc19 = null;
		//chamado da classe, objeto e dos devidos métodos para realização do exercício 19
		Exercicio19 exercicio19 = new Exercicio19();
		Double resultadoExerc19 = exercicio19.exercicio19(nota1_exerc19, nota2_exerc19, media_exerc19, nome_exerc19);
		
		//variáveis necessárias para realização do exercício 20
		int num_exerc20 = 0;
		int resto_exerc20 = 0;
		//chamado da classe, objeto e dos devidos métodos para realização do exercício 20
		Exercicio20 exercicio20 = new Exercicio20();
		int resultadoExerc20 = exercicio20.exercicio20(num_exerc20, resto_exerc20);
		
		//variáveis necessárias para realização do exercício 21
		int ano_exerc21 = 0;
		int resto_exerc21 = 0;
		//chamado da classe, objeto e dos devidos métodos para realização do exercício 21
		Exercicio21 exercicio21 = new Exercicio21();
		int resultadoExerc21 = exercicio21.exercicio21(ano_exerc21, resto_exerc21);
		
		//variáveis necessárias para realização do exercício 22
		int ano_exerc22 = 0;
		int idade_exerc22 = 0;
		int auxiliar_exerc22 = 0;
		//chamado da classe, objeto e dos devidos métodos para realização do exercício 22
		Exercicio22 exercicio22 = new Exercicio22();
		int resultadoExerc22 = exercicio22.exercicio22(ano_exerc22, idade_exerc22, auxiliar_exerc22);
		
		//variáveis necessárias para realização do exercício 23
		String nome_exerc23 = null;
		char sexo_exerc23 = 0;
		double preco_exerc23 = 0;
		//chamado da classe, objeto e dos devidos métodos para realização do exercício 23
		Exercicio23 exercicio23 = new Exercicio23();
		Double resultadoExerc23 = exercicio23.exercicio23(nome_exerc23, sexo_exerc23, preco_exerc23);
		
		//variáveis necessárias para realização do exercício 24
		double distancia_exerc24 = 0;
		double preco_exerc24 = 0;
		//chamado da classe, objeto e dos devidos métodos para realização do exercício 24
		Exercicio24 exercicio24 = new Exercicio24();
		Double resultadoExerc24 = exercicio24.exercicio24(distancia_exerc24, preco_exerc24);
		
		//variáveis necessárias para realização do exercício 25
		int a_exerc25 = 0;
		int b_exerc25 = 0;
		int c_exerc25 = 0;
		//chamado da classe, objeto e dos devidos métodos para realização do exercício 25
		Exercicio25 exercicio25 = new Exercicio25();
		int resultadoExerc25 = exercicio25.exercicio25(a_exerc25, b_exerc25, c_exerc25);
		
	}
}