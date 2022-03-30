import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        // Declaração de variáveis
        Scanner kb = new Scanner(System.in);

        double n1, n2, n3, med;

        // Entrada de dados
        System.out.print("Nota 1 --> ");
        n1 = kb.nextDouble();

        System.out.print("Nota 2 --> ");
        n2 = kb.nextDouble();

        System.out.print("Nota 3 --> ");
        n3 = kb.nextDouble();

        // Processamento de dados
        med = (n1 + n2 + n3) / 3;

        // System.out.println("Média --> " + med);

        // Saída de dados
        if (med >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        
        kb.close();
    }
}
