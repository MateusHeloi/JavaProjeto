package main;

import java.util.Scanner;

import retangulo.Retangulo;

public class CalcularRetangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		Retangulo ret = new Retangulo(); 
		System.out.println("Digite os valores da altura e base nessa ordem \n");
		 ret.height = sc.nextDouble();
		 ret.width = sc.nextDouble();
		 ret.area();
		 ret.diagonal();
		 ret.perimetro();
		 System.out.println(ret);
		

	}

}
