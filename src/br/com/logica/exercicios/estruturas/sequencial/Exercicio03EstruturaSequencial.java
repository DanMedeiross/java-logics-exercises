package br.com.logica.exercicios.estruturas.sequencial;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio03EstruturaSequencial {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 4 valores inteiros: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		/*double produto1 = a * b;
		double produto2 = c * d;*/
		
		double diferenca = a * b - c * d;
		
		System.out.println("DIFERENÇA ENTRE OS PRODUTOS: " + diferenca);
		
		sc.close();
	}
}