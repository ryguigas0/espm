import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int a, b, c;

        System.out.print("a --> ");
        a = kb.nextInt();

        System.out.print("b --> ");
        b = kb.nextInt();

        System.out.print("c --> ");
        c = kb.nextInt();

        kb.close();

        if (a == b && b == c) {
            System.out.println("Valores são todos iguais");
        } else {
            if (a < b && b < c) {
                System.out.println("O menor valor é " + a);
            } else if (b < a && a < c) {
                System.out.println("O menor valor é " + b);
            } else {
                System.out.println("O menor valor é " + c);
            }
        }
    }
}
