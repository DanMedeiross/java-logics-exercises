package br.com.logica.exercicios.estruturas.repetitivas.para;

import java.util.Scanner;

public class Exercicio04EstruturaRepetitivaPara {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor inteiro: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite dois n�meros: ");
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			
			if (b == 0) {
				System.out.println("Divis�o imposs�vel");
			} else {
				double div = a / b;
				System.out.println("Divis�o do primeiro pelo segundo: " + div);
			}
		}
		sc.close();
	}
}