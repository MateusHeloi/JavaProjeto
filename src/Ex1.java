import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num=new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			
			System.out.println("Digite o valor para o vetor da posicao "+i );
			num[i]= sc.nextInt();
			
			
		}
		for (int i = 0; i < num.length; i++) {
			
			System.out.println("o valor do vetor e "+num[i] );
		
			
			
		}

	}

}
