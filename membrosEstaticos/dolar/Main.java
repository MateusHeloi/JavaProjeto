package dolar;

import java.util.Scanner;

import calcularDolar.CalcularDolar;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do dolar");
		CalcularDolar.dollar = sc.nextDouble();
		System.out.println("Digite o quanto voê quer comprar");
		double qtd = sc.nextDouble();
		
		calcularDolar.CalcularDolar.calcular(calcularDolar.CalcularDolar.dollar, qtd);

	}

}
