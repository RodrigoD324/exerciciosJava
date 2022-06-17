package Exercicios;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		exercicio1 Exercicio1 = new exercicio1();
		String resultadoExerc1 = Exercicio1.Exercicio1();
		
		//variáveis necessárias para realização do exercício 2
		String nome_exerc2 = null;
		//chamado da classe, objeto e dos devidos métodos para realização do exercício 2
		exercicio2 Exercicio2 = new exercicio2();
		String resultadoExerc2 = Exercicio2.Exercicio2(nome_exerc2);

		//variáveis necessárias para realização do exercício 3
		String nome_exerc3 = null;
		double salario_exerc3 = 0;
		//chamado da classe, objeto e dos devidos métodos para realização do exercício 3
		exercicio3 Exercicio3 = new exercicio3();
		Void resultadoExerc3 = Exercicio3.Exercicio3(nome_exerc3, salario_exerc3);

		//variáveis necessárias para realização do exercício 4
		int num1_exerc4 = 0;
		int num2_exerc4 = 0;
		int result_exerc4 = 0;
		//chamado da classe, objeto e dos devidos métodos para realização do exercício 4
		exercicio4 Exercicio4 = new exercicio4();
		int resultadoExerc4 = Exercicio4.Exercicio4(num1_exerc4, num2_exerc4, result_exerc4);
		
		//variáveis necessárias para realização do exercício 5
		double nota1_exerc5 = 0;
		double nota2_exerc5 = 0;
		double media_exerc5 = 0;
		//chamado da classe, objeto e dos devidos métodos para realização do exercício 5
		exercicio5 Exercicio5 = new exercicio5();
		Double resultadoExerc5 = Exercicio5.Exercicio5(nota1_exerc5, nota2_exerc5, media_exerc5);
		
		//variáveis necessárias para realização do exercício 6
		int num_exerc6 = 0;
		int sucessor_exerc6 = 0;
		int antecessor_exerc6 = 0;
		//chamado da classe, objeto e dos devidos métodos para realização do exercício 6
		exercicio6 Exercicio6 = new exercicio6();
		int resultadoExerc6 = Exercicio6.Exercicio6(num_exerc6, sucessor_exerc6, antecessor_exerc6);

	}
}
