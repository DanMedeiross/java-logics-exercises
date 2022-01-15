package br.com.logica.exercicios.estruturas.condicional;

import java.util.Scanner;

public class Exercicio01EstruturaCondicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NÃO NEGATIVO");
		}
		
		sc.close();
	}
}