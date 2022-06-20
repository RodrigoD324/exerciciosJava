package sequenciasBasicas;

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
		
		//variáveis necessárias para realização do exercício 7
		double num_exerc7 = 0;
		double dobro_exerc7 = 0;
		double terca_exerc7 = 0;
		//chamado da classe, objeto e dos devidos métodos para realização do exercício 7
		exercicio7 Exercicio7 = new exercicio7();
		Double resultadoExerc7 = Exercicio7.Exercicio7(num_exerc7, dobro_exerc7, terca_exerc7);
		
		//variáveis necessárias para realização do exercício 8
		double distancia_exerc8 = 0;
		double km_exerc8 = 0;
		double hm_exerc8 = 0;
		double dam_exerc8 = 0;
		double dm_exerc8 = 0;
		double cm_exerc8 = 0;
		double mm_exerc8 = 0;
		//chamado da classe, objeto e dos devidos métodos para realização do exercício 8
		exercicio8 Exercicio8 = new exercicio8();
		Double resultadoExerc8 = Exercicio8.Exercicio8(distancia_exerc8, km_exerc8, hm_exerc8, dam_exerc8, dm_exerc8, cm_exerc8, mm_exerc8);
		
		//variáveis necessárias para realização do exercício 9
		double carteira_exerc9 = 0;
		double dolares_exerc9 = 0;
		//chamado da classe, objeto e dos devidos métodos para realização do exercício 9
		exercicio9 Exercicio9 = new exercicio9();
		Double resultadoExerc9 = Exercicio9.Exercicio9(carteira_exerc9, dolares_exerc9);
		
		//variáveis necessárias para realização do exercício 10
		double largura_exerc10 = 0;
		double altura_exerc10 = 0;
		double area_exerc10 = 0;
		//chamado da classe, objeto e dos devidos métodos para realização do exercício 10
		exercicio10 Exercicio10 = new exercicio10();
		Double resultadoExerc10 = Exercicio10.Exercicio10(largura_exerc10, altura_exerc10, area_exerc10);
		
		//variáveis necessárias para realização do exercício 11
		double a_exerc11 = 0;
		double b_exerc11 = 0;
		double c_exerc11 = 0;
		double delta_exerc = 0;
		//chamado da classe, objeto e dos devidos métodos para realização do exercício 11
		exercicio11 Exercicio11 = new exercicio11();
		Double resultadoExerc11 = Exercicio11.Exercicio11(a_exerc11, b_exerc11, c_exerc11, delta_exerc);
		
		//variáveis necessárias para realização do exercício 12
		double preco_exerc12 = 0;
		double promocao_exerc12 = 0;
		//chamado da classe, objeto e dos devidos métodos para realização do exercício 12
		exercicio12 Exercicio12 = new exercicio12();
		Double resultadoExerc12 = Exercicio12.Exercicio12(preco_exerc12, promocao_exerc12);	
		
		//variáveis necessárias para realização do exercício 13
		double salario_exerc13 = 0;
		double porcentagem_exerc13 = 0;
		//chamado da classe, objeto e dos devidos métodos para realização do exercício 13
		exercicio13 Exercicio13 = new exercicio13();
		Double resultadoExerc13 = Exercicio13.Exercicio13(salario_exerc13, porcentagem_exerc13);
		
		//variáveis necessárias para realização do exercício 14
		double km_exerc14 = 0;
		int dias_exerc14 = 0;
		double total_exerc14 = 0;
		//chamado da classe, objeto e dos devidos métodos para realização do exercício 14
		exercicio14 Exercicio14 = new exercicio14();
		Double resultadoExerc14 = Exercicio14.Exercicio14(km_exerc14, dias_exerc14, total_exerc14);
		
		//variáveis necessárias para realização do exercício 15
		int dias_exerc15 = 0;
		double salario_exerc15 = 0;
		//chamado da classe, objeto e dos devidos métodos para realização do exercício 15
		exercicio15 Exercicio15 = new exercicio15();
		Double resultadoExerc15 = Exercicio15.Exercicio15(dias_exerc15, salario_exerc15);
		
		//variáveis necessárias para realização do exercício 16
		int cigarros_exerc16 = 0;
		int anos_exerc16 = 0;
		int diasTotal_exerc16 = 0;
		int cigarrosTotal_exerc16 = 0;
		int minutos_exerc16 = 0;
		int diasPerdidos_exerc16 = 0;
		//chamado da classe, objeto e dos devidos métodos para realização do exercício 16
		exercicio16 Exercicio16 = new exercicio16();
		int resultadoExerc16 = Exercicio16.Exercicio16(cigarros_exerc16, anos_exerc16, diasTotal_exerc16, cigarrosTotal_exerc16, minutos_exerc16, diasPerdidos_exerc16);
		
	}
}