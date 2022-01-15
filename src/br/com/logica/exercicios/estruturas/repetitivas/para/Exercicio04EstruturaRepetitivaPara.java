package br.com.logica.exercicios.estruturas.repetitivas.para;

import java.util.Scanner;

public class Exercicio04EstruturaRepetitivaPara {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor inteiro: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite dois números: ");
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			
			if (b == 0) {
				System.out.println("Divisão impossível");
			} else {
				double div = a / b;
				System.out.println("Divisão do primeiro pelo segundo: " + div);
			}
		}
		sc.close();
	}
}