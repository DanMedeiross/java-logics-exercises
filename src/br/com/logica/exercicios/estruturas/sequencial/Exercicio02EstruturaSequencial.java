package br.com.logica.exercicios.estruturas.sequencial;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio02EstruturaSequencial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite o valor do raio da circunfer�ncia: ");
		double raio = sc.nextDouble();
		double pi = 3.14159;
		double area = pi * (raio * raio);
		
		System.out.printf("�REA DA CIRCUNFER�NCIA = %.4f%n", area);
		
		sc.close();
	}
}