package br.com.logica.exercicios.estruturas.sequencial;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio04EstruturaSequencial {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o n�mero identificador do funcion�rio: ");
		int idFuncionario = sc.nextInt();
		
		System.out.print("Digite o n�mero de horas trabalhadas pelo funcion�rio: ");
		double horasTrabalhadas = sc.nextDouble();
		
		System.out.print("Digite o valor da hora de trabalho do funcion�rio: ");
		double valorHora = sc.nextDouble();
		
		double salario = horasTrabalhadas * valorHora;
		
		System.out.println("NUMBER = " + idFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	}
}