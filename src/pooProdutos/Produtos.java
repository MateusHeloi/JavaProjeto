package pooProdutos;

public class Produtos {
	

		public String nome;
		public double preco;
		public int qtdEstoque;
		public void MostrarDados() {
			System.out.printf("Nome: "+nome,"Preço: "+preco,"Quantidade no estoque: "+qtdEstoque);
		}
		public double totalValorNoEstoque() {
			return preco*qtdEstoque;
		}
		public void adicionarProdutos(int qtdEstoque) {
			this.qtdEstoque += qtdEstoque;
		}
		public void removerProdutos(int qtdEstoque) {
			this.qtdEstoque -= qtdEstoque;
		}
		public String toString() {
			return nome
			+ ",$"
			+ preco
			+ ","
			+ qtdEstoque
			+"units, Total: $"
			+ totalValorNoEstoque(); 
			
		}

	


}
