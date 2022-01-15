package br.com.logica.exercicios.estruturas.repetitivas.para;

import java.util.Scanner;

public class Exercicio01EstruturaRepetitivaPara {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero inteiro: ");
		int x = sc.nextInt();
		
		while (x < 1 || x > 1000) {
			System.out.print("Valor digitado incorreto. Digite um valor entre 1 e 1000: ");
			x = sc.nextInt();
		}
			
		for (int i = 1; i <= x ; i++) {
			if (i % 2 != 0) {
				System.out.println("N�meros �mpares de 1 a " + x);
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}