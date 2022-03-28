import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        // Declaração das variáveis
        Scanner kb = new Scanner(System.in);
        double a, b, c, x1, x2;

        // Entrada de dados
        System.out.print("a --> ");
        a = kb.nextDouble();
        System.out.print("b --> ");
        b = kb.nextDouble();
        System.out.print("c --> ");
        c = kb.nextDouble();

        // Processamento
        double sqrt_delta = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        x1 = (-b + sqrt_delta) / (2 * a);
        x2 = (-b - sqrt_delta) / (2 * a);

        // Saída de dados
        System.out.println("x1 --> " + String.format("%.2f", x1));
        System.out.println("x2 --> " + String.format("%.2f", x2));

        kb.close();
    }
}
