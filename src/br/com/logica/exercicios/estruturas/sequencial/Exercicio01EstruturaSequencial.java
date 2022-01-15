package br.com.logica.exercicios.estruturas.sequencial;
import java.util.Scanner;

public class Exercicio01EstruturaSequencial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		
		int soma = valor1 + valor2;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}
}