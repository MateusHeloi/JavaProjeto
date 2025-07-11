import java.util.Iterator;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		String candidato []= new String[7];
		int qtd []= new int[7];
		receberCandidato(candidato);
		
		exibirVotos(candidato, receberVotos(candidato, qtd));

	}
	public static void receberCandidato(String []candidato) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome de 5 candidatos");
		for (int i = 1; i < candidato.length; i++) {
			System.out.println("Digite o nome do candidato "+(i));
			candidato[i] = sc.nextLine();
			
			
		}

	}
	public static int[] receberVotos(String []candidato, int []qtdV) {
		int menu=0;
		int op=0;
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Escolha (0) BRANCO\r\n"
					+ "(1)Candidato "+candidato[1]+" 1\r\n"
					+ "(2)candidato "+candidato[2]+" 2\r\n"
					+ "(3)candidato "+candidato[3]+" 3\r\n"
					+ "(4)candidato "+candidato[4]+" 4\r\n"
					+ "(5)candidato "+candidato[5]+" 5");
			
			op = sc.nextInt();
			switch(op) {
			case 0:
				qtdV[0]+= 1;
			
				break;
			
			case 1:
				qtdV[1]+= 1;
				
				break;
			case 2:
				qtdV[2]+= 1;
				
				break;
			case 3:
				qtdV[3]+= 1;
				
				break;
			case 4:
				qtdV[4]+= 1;
				
				break;
			case 5:
				qtdV[5]+= 1;
				
				break;
			default:
				qtdV[6]+= 1;
				
			
			
			}
			System.out.println("Digite 1 para sair da votacao");
			menu = sc.nextInt();
			
			
			
			
		}while(menu==0);
		
		return qtdV;
	}
	public static void exibirVotos(String []candidato, int []qtdV) {
		System.out.println("VOTOS BRANCO "+qtdV[0]+"\n Candidato 1 : "+candidato[1]+ "Quantidade de votos "+qtdV[1]);
		System.out.println("\n Candidato 2 : "+candidato[2]+ "Quantidade de votos "+qtdV[2]);
		System.out.println("\n Candidato 3 : "+candidato[3]+ "Quantidade de votos "+qtdV[3]);
		System.out.println("\n Candidato 4 : "+candidato[4]+ "Quantidade de votos "+qtdV[4]);
		System.out.println("\n Candidato 5 : "+candidato[5]+ "Quantidade de votos "+qtdV[5]);
		System.out.println("\n VOTO NULOS Quantidade de votos "+qtdV[6]);
		int maior = Integer.MIN_VALUE; // Inicializa com o menor valor possível

        for (int elemento : qtdV) {
            if (elemento > maior) {
                maior = elemento;
            }
        }
	}
	

}
