package br.com.logica.exercicios.estruturas.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05EstruturaCondicional {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o código do item: ");
		int codigo = sc.nextInt();
		
		System.out.print("Digite a quantidade de unidades do respectivo item: ");
		int quantidade = sc.nextInt();
		double total = 0;
		
		if (codigo == 1) {
			total = 4.00 * quantidade;
		} else if (codigo == 2) {
			total = 4.50 * quantidade;
		} else if (codigo == 3){
			total = 5.00 * quantidade;
		} else if (codigo == 4) {
			total = 2.00 * quantidade;
		} else if (codigo == 5) {
			total = 1.50 * quantidade;
		} else {
			System.out.println("Código inválido");
		}
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();
	}
}