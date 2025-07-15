package pooMain;
import pooProdutos.Produtos;
import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produtos produto = new Produtos();
		System.out.println("Entre com o dados do produto");
		System.out.println("Name: ");
		produto.nome = sc.nextLine();	
		
		System.out.println("preço: ");
		produto.preco = sc.nextDouble();		
		
		System.out.println("Quantidade no estoque: ");
		produto.qtdEstoque = sc.nextInt();
		
		System.out.println(produto);
		System.out.println("entre o com o numero de produtos para adicionar no estoque");
		int quantidade = sc.nextInt();
		produto.adicionarProdutos(quantidade);
		System.out.println();
		System.out.println(produto);
		
		System.out.println("entre o com o numero de produtos para remover no estoque");
		quantidade = sc.nextInt();
		produto.removerProdutos(quantidade);
		System.out.println();
		System.out.println(produto);
		
		
		sc.close();

		

		

	}

}
