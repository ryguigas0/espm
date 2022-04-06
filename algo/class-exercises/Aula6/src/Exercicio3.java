import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        double a, b, c;
        double delta, x1, x2;

        Scanner kb = new Scanner(System.in);

        System.out.print("a --> ");
        a = kb.nextDouble();

        System.out.print("b --> ");
        b = kb.nextDouble();

        System.out.print("c --> ");
        c = kb.nextDouble();

        kb.close();

        delta = b * b - 4 * a * c;

        if (delta >= 0 && a != 0) {
            x1 = (delta - b) / (2 * a);
            if (delta == 0) {
                x2 = x1;
            } else {
                x2 = (-delta - b) / (2 * a);
            }
            System.out.println("x1 --> " + x1 + " x2 -->" + x2);
        } else {
            System.out.println("Não há raízes reais");
        }

    }
}