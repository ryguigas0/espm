import java.util.Scanner;

public class ProblemaSucessor {
    // Leia um valor inteiro entre 0 e 60 e mostre no o seu sucessor
    // Se o número for 60, então retorne 1
    // Não use comandos de teste
    public static void main(String[] args) {
        // Declaração das variáveis
        Scanner kb = new Scanner(System.in);
        int num, successor;

        // Entrada de dados
        System.out.print("número entre 0 e 60 --> ");
        num = kb.nextInt();

        successor = (num + 1) % 61;

        System.out.println("sucessor de " + num + " --> " + successor);

        kb.close();
    }
}
