package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = entrada.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = entrada.nextInt();
		
		int soma = soma(a, b);
		int subtracao = subtracao(a, b);
		int multiplicaco = multiplicacao(a,b);
		double divisao = divisao(a,b);
		
		System.out.println("Soma dos valores -> " + soma);
		System.out.println("Subtração dos valores -> " + subtracao);
		System.out.println("Multiplicaco dos valores -> " + multiplicaco);
		System.out.println("Divisao dos valores -> " + divisao);
		
		entrada.close();
	}
	
	public static int soma(int a, int b) {
		return a + b;
	}
	
	public static int subtracao(int a, int b) {
		return a - b;
	}
	
	public static double divisao(double a, double b) {
		return a / b;
	}
	
	public static int multiplicacao(int a, int b) {
		return a * b;
	}

}
