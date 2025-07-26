package banco;

import java.util.Scanner;

public class BancoSistema {
	private double dinheiro;
	private int numeroConta;
	private String nomeTitular;
	private double depositoInicial;
	Scanner sc = new Scanner(System.in);

	public BancoSistema(int numeroConta, String nomeTitular) {

	
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.dinheiro =0;
		
	}

	public double getDinheiro() {
		return dinheiro;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getDepositoInicial() {
		return depositoInicial;
	}

	public void setDepositoInicial(double depositoInicial) {
		this.depositoInicial = depositoInicial;
		dinheiro = dinheiro + depositoInicial;
	}

	public void deposito(double valorDeposito) {
		dinheiro += valorDeposito;

	}

	public void depositoInicialPergun(Scanner sc) {
	    System.out.println("Quer começar com deposito inicial ?");
	    String simOuNao = sc.nextLine();
	    
	    if (simOuNao.equalsIgnoreCase("sim")) {
	        System.out.println("Digite o valor");
	        double valor = sc.nextDouble();
	        setDepositoInicial(valor);
	    }
	}
	
	public void saque(double valor) {
		dinheiro= dinheiro-valor-5;
		
		
	}

	@Override
	public String toString() {
		return "Atualização de dados [dinheiro=" + dinheiro + ", numeroConta=" + numeroConta + ", nomeTitular=" + nomeTitular
				+ "]";
	}
	

}
