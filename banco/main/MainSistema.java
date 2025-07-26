package main;

import java.util.Scanner;

import banco.BancoSistema;

public class MainSistema {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		String name;
		double deposito=0;
		double saque=0;
		System.out.println("Entre colocando o numero da sua conta"); 
		number = sc.nextInt();
		sc.nextLine();
		System.out.println("Coloque o nome do titular da sua conta"); 
		name = sc.nextLine();
		BancoSistema bs = new BancoSistema(number,name);
		
		bs.depositoInicialPergun(sc);
		System.out.println(bs);
		
		System.out.println("Coloque valor para o deposito");
		deposito = sc.nextDouble();
		bs.deposito(deposito);
		
		System.out.println(bs);
		System.out.println("Coloque valor para o sque");
		saque = sc.nextDouble();
		bs.saque(saque);
		System.out.println(bs);

	}

}
