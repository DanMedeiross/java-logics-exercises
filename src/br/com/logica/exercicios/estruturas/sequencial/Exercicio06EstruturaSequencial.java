package br.com.logica.exercicios.estruturas.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06EstruturaSequencial {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 3 valores numéricos: ");
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double pi = 3.14159;
		
		double areaTriangulo = (a * c) / 2;
		double areaCircunferencia = pi * c * c;
		double areaTrapezio = ((a + b) * c) / 2;
		double areaQuadrado = b * b;
		double areaRetangulo = a * b;
		
		System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
		System.out.printf("CIRCULO: %.3f%n", areaCircunferencia);
		System.out.printf("TTRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
		
		sc.close();
	}
}