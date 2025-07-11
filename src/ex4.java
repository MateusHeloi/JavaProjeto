import java.util.Scanner;
import java.util.Random;

public class ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] senha = gerarSenha();
        System.out.println("Bem-vindo ao Jogo da Senha!");
        System.out.println("Tente adivinhar a senha de 4 números entre 1 e 6. Você tem 10 tentativas.");
        boolean ganhou = false;
        for (int i = 1; i <= 10; i++) {
            System.out.println("\nTentativa " + i + ":");
            int[] tentativa = lerTentativa(scanner);
            int corretos = contarCorretos(senha, tentativa);
            int deslocados = contarDeslocados(senha, tentativa);
            System.out.println("Corretos na posição certa: " + corretos);
            System.out.println("Corretos na posição errada: " + deslocados);
            if (corretos == 4) {
                ganhou = true;
                break;
            }
        }
        if (ganhou) {
            System.out.println("Parabéns! Você descobriu a senha!");
        } else {
            System.out.print("Fim de jogo! A senha era: ");
            mostrarVetor(senha);
        }
        scanner.close();
    }

    public static int[] gerarSenha() {
        Random random = new Random();
        int[] senha = new int[4];
        for (int i = 0; i < 4; i++) {
            senha[i] = random.nextInt(6) + 1;
        }
        return senha;
   }
    public static int[] lerTentativa(Scanner scanner) {
        int[] tentativa = new int[4];
        boolean valido = false;
        while (!valido) {
            System.out.print("Digite 4 números  1 e 6 separados por espaço: ");
            String linha = scanner.nextLine();
            String[] partes = linha.split(" ");
                    if (partes.length != 4) {
                System.out.println("Entrada inválida. Digite exatamente 4 números.");
                continue;
            }
            boolean ok = true;
            for (int i = 0; i < 4; i++) {
                String parte = partes[i];

                if (parte.length() == 1 && parte.charAt(0) >= '1' && parte.charAt(0) <= '6') {
          tentativa[i] = parte.charAt(0) - '0';
                } else {
                    ok = false;
 break;  }
            }

            if (ok) {
                valido = true;
            } else {
                System.out.println(" inválid use apenas números de1 a 6.");
            }
        }

        return tentativa;
    }

    public static int contarCorretos(int[] senha, int[] tentativa) {
        int contador = 0;
        for (int i = 0; i < 4; i++) {
            if (senha[i] == tentativa[i]) {
                contador++;
            }
        }
        return contador;
    }

  
    public static int contarDeslocados(int[] senha, int[] tentativa) {
        boolean[] senhaUsada = new boolean[4];
        boolean[] tentativaUsada = new boolean[4];
        int deslocados = 0;

        for (int i = 0; i < 4; i++) {
            if (senha[i] == tentativa[i]) {
                senhaUsada[i] = true;
                tentativaUsada[i] = true;
            }
        }

      
        for (int i = 0; i < 4; i++) {
            if (!tentativaUsada[i]) {
                for (int j = 0; j < 4; j++) {
                    if (!senhaUsada[j] && tentativa[i] == senha[j]) {
                        deslocados++;
                        senhaUsada[j] = true;
                        break;
                    }
                }
            }
        }

        return deslocados;
    }

   
    public static void mostrarVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
