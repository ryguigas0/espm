import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double a, b, c;

        System.out.print("lado 1 --> ");
        a = kb.nextDouble();
        System.out.print("lado 2 --> ");
        b = kb.nextDouble();
        System.out.print("lado 3 --> ");
        c = kb.nextDouble();

        if (a < b + c && b < a + c && c < b + a) {
            System.out.println("Esses lados são de um triângulo");
        } else {
            System.out.println("Esses lados não são de um triângulo");
        }

        kb.close();
    }
}
