package br.com.logica.exercicios.estruturas.sequencial;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio05EstruturaSequencial {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o código da primeira peça: ");
		int peca1 = sc.nextInt();
		
		System.out.print("Digite o número de peças do respectivo código: ");
		int numeropecas1 = sc.nextInt();
		
		System.out.print("Digite o valor unitário da peça do código informado: ");
		double valorunitpeca1 = sc.nextDouble();
		
		System.out.print("Digite o código da segunda peça: ");
		int peca2 = sc.nextInt();
		
		System.out.print("Digite o número de peças do respectivo código: ");
		int numeropecas2 = sc.nextInt();
		
		System.out.print("Digite o valor unitário da peça do código informado: ");
		double valorunitpeca2 = sc.nextDouble();
		
		double total = (valorunitpeca1 * numeropecas1) + (valorunitpeca2 * numeropecas2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
	}
}