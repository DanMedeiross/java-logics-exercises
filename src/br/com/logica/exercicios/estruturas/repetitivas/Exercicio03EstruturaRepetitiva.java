package br.com.logica.exercicios.estruturas.repetitivas;

import java.util.Scanner;

public class Exercicio03EstruturaRepetitiva {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		System.out.print("Digite o c�digo do combust�vel: ");
		int codComb = sc.nextInt();
		
		while (codComb != 4) {
			
			if (codComb == 1) {
				alcool += 1;
			} else if (codComb == 2) {
				gasolina += 1;
			} else if (codComb == 3) {
				diesel += 1;
			} else if (codComb < 0 || codComb > 4) {
				System.out.print("C�digo inv�lido. Digite um c�digo v�lido: ");
			}
			
			codComb = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("�lcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}
}