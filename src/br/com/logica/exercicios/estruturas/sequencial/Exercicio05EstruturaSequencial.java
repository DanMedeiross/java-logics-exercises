package br.com.logica.exercicios.estruturas.sequencial;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio05EstruturaSequencial {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o c�digo da primeira pe�a: ");
		int peca1 = sc.nextInt();
		
		System.out.print("Digite o n�mero de pe�as do respectivo c�digo: ");
		int numeropecas1 = sc.nextInt();
		
		System.out.print("Digite o valor unit�rio da pe�a do c�digo informado: ");
		double valorunitpeca1 = sc.nextDouble();
		
		System.out.print("Digite o c�digo da segunda pe�a: ");
		int peca2 = sc.nextInt();
		
		System.out.print("Digite o n�mero de pe�as do respectivo c�digo: ");
		int numeropecas2 = sc.nextInt();
		
		System.out.print("Digite o valor unit�rio da pe�a do c�digo informado: ");
		double valorunitpeca2 = sc.nextDouble();
		
		double total = (valorunitpeca1 * numeropecas1) + (valorunitpeca2 * numeropecas2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
	}
}