package br.com.logica.exercicios.estruturas.repetitivas.para;

import java.util.Scanner;

public class Exercicio07EstruturaRepetitivaPara {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor inteiro positivo: ");
		int n = sc.nextInt();
		
		while (n < 0) {
			System.out.print("Valor incorreto. Digite um valor positivo: ");
			n = sc.nextInt();
		}
		
		for (int i = 1; i <= n; i++) {
			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
		}
		
		sc.close();
	}
}