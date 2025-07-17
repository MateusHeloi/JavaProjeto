package main;

import java.util.Scanner;

import estudante.Estudante;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Estudante es = new Estudante();
		String nome;
		double nota;
		double[] notas = new double [2];
		
		System.out.println("Digite o seu nome ");
		nome = sc.nextLine();
		System.out.println("Digite a nota do primeiro trimestre");
		nota = sc.nextDouble();
		
		for (int i = 0; i < notas.length; i++) {
			  System.out.println("Digite o valor das notas dos outros trimestres");
			  notas[i] = sc.nextDouble();
	        }
		es.CalcularNota(nota, nome, notas);
	}

}
