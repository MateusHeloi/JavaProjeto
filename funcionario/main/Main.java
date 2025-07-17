package main;

import java.util.Scanner;

import funcionario.Emplyoee;

public class Main {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Emplyoee funcionario = new Emplyoee();
			
			System.out.println("Digite o seu nome o seu salário bruto e a taxa");
			funcionario.Name= sc.nextLine();
			funcionario.GlossSalary= sc.nextDouble();
			funcionario.Tax= sc.nextDouble();
			
			System.out.println("Digite a porcentagem para aumentar o salario");
			double porcentagem =  sc.nextDouble();
			funcionario.IncreaseSalary(porcentagem);
			System.out.println(funcionario);
			

			
	}

}
