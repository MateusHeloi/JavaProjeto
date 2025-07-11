import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		int idade []= new int[4];
		String nome []= new String[4];
	
		
		preencherNome(nome);
		preencherIdade(idade);
		
		
		decisao(media(idade), idade, nome);

	}
	public static void preencherNome(String[]nome) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < nome.length; i++) {
			System.out.println("Digite o nome do aluno "+i);
			nome[i]= sc.next();
			
		}
		
		
		
	}
	public static void preencherIdade(int[]idade) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < idade.length; i++) {
			System.out.println("Digite a idade do aluno "+i);
			idade[i]= sc.nextInt();
			
		}
		
		
		
	}
	public static int media(int[]mediaIdades) {
		int somaVet=0;
	
		for (int i = 0; i < mediaIdades.length; i++) {
			somaVet+=mediaIdades[i];
			
		}
		int resultado=somaVet/mediaIdades.length;
		
		return resultado;
		
		
		
	}
	public static void decisao(int mediaIdades, int[] idade, String [] nome) {
		
		for (int i = 0; i < idade.length; i++) {
			if(idade[i]>mediaIdades) {
				System.out.println("Tem nota acima da media "+nome[i]+ " de "+idade[i]+ "anos");
				
			}
			
		}
		
		
		
		
		
	}

}
