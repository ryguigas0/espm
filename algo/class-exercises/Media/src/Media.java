import java.util.Scanner;

public class Media {
    public static void main(String[] args) throws Exception {

        // Declaração das variáveis
        Scanner kb = new Scanner(System.in);
        double nota1, nota2, nota3, media;

        // Entrada de dados
        System.out.println("Nota 1: ");
        nota1 = kb.nextDouble();
        System.out.println("Nota 2: ");
        nota2 = kb.nextDouble();
        System.out.println("Nota 3: ");
        nota3 = kb.nextDouble();

        // Processamento
        media = (nota1 + nota2 + nota3) / 3;

        // Saída de dados
        System.out.println("Média das notas: " + media);

        kb.close();
    }
}
