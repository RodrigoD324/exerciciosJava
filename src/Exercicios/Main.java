package Exercicios;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		exercicio1 Exercicio1 = new exercicio1();
		String resultadoExerc1 = Exercicio1.Exercicio1();
		
		//vari�veis necess�rias para realiza��o do exerc�cio 2
		String nome_exerc2 = null;
		//chamado da classe, objeto e dos devidos m�todos para realiza��o do exerc�cio 2
		exercicio2 Exercicio2 = new exercicio2();
		String resultadoExerc2 = Exercicio2.Exercicio2(nome_exerc2);

		//vari�veis necess�rias para realiza��o do exerc�cio 3
		String nome_exerc3 = null;
		double salario_exerc3 = 0;
		//chamado da classe, objeto e dos devidos m�todos para realiza��o do exerc�cio 3
		exercicio3 Exercicio3 = new exercicio3();
		Void resultadoExerc3 = Exercicio3.Exercicio3(nome_exerc3, salario_exerc3);

		//vari�veis necess�rias para realiza��o do exerc�cio 4
		int num1_exerc4 = 0;
		int num2_exerc4 = 0;
		int result_exerc4 = 0;
		//chamado da classe, objeto e dos devidos m�todos para realiza��o do exerc�cio 4
		exercicio4 Exercicio4 = new exercicio4();
		int resultadoExerc4 = Exercicio4.Exercicio4(num1_exerc4, num2_exerc4, result_exerc4);
		
		//vari�veis necess�rias para realiza��o do exerc�cio 5
		double nota1_exerc5 = 0;
		double nota2_exerc5 = 0;
		double media_exerc5 = 0;
		//chamado da classe, objeto e dos devidos m�todos para realiza��o do exerc�cio 5
		exercicio5 Exercicio5 = new exercicio5();
		Double resultadoExerc5 = Exercicio5.Exercicio5(nota1_exerc5, nota2_exerc5, media_exerc5);
		
		//vari�veis necess�rias para realiza��o do exerc�cio 6
		int num_exerc6 = 0;
		int sucessor_exerc6 = 0;
		int antecessor_exerc6 = 0;
		//chamado da classe, objeto e dos devidos m�todos para realiza��o do exerc�cio 6
		exercicio6 Exercicio6 = new exercicio6();
		int resultadoExerc6 = Exercicio6.Exercicio6(num_exerc6, sucessor_exerc6, antecessor_exerc6);

	}
}
