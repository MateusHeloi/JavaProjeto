import java.util.Scanner;

public class ex2gpt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int idade[] = new int[4];
        String nome[] = new String[4];

        preencherNome(nome, sc);
        preencherIdade(idade, sc);

        int mediaIdade = media(idade);
        decisao(mediaIdade, idade, nome);

        sc.close();
    }

    public static void preencherNome(String[] nome, Scanner sc) {
        for (int i = 0; i < nome.length; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nome[i] = sc.nextLine();  // permite nome com espaços
        }
    }

    public static void preencherIdade(int[] idade, Scanner sc) {
        for (int i = 0; i < idade.length; i++) {
            System.out.print("Digite a idade do aluno " + (i + 1) + ": ");
            while (!sc.hasNextInt()) {
                System.out.println("Por favor, digite um número inteiro.");
                sc.next(); // consome entrada inválida
            }
            idade[i] = sc.nextInt();
            sc.nextLine(); // limpa o ENTER do buffer
        }
    }

    public static int media(int[] mediaIdades) {
        int soma = 0;
        for (int i = 0; i < mediaIdades.length; i++) {
            soma += mediaIdades[i];
        }
        return soma / mediaIdades.length;
    }

    public static void decisao(int mediaIdades, int[] idade, String[] nome) {
        for (int i = 0; i < idade.length; i++) {
            if (idade[i] < mediaIdades) {
                System.out.println(nome[i] + " tem idade abaixo da média: " + idade[i] + " anos");
            }
        }
    }
}
