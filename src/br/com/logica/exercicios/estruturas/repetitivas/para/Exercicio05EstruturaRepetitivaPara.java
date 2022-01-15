package br.com.logica.exercicios.estruturas.repetitivas.para;

import java.util.Scanner;

public class Exercicio05EstruturaRepetitivaPara {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor inteiro para calcular seu fatorial: ");
		int n = sc.nextInt();
		int fat = 1;
		
		for (int i = 1; i <= n; i++) {
			fat = fat * i;
		}
		
		System.out.println(fat);
		
		sc.close();
	}
}