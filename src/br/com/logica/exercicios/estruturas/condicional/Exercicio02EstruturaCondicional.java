package br.com.logica.exercicios.estruturas.condicional;

import java.util.Scanner;

public class Exercicio02EstruturaCondicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("ÍMPAR");
		}
		
		sc.close();
	}
}