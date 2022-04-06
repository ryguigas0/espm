import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        double a, b, c;
        double delta, x1, x2;

        Scanner kb = new Scanner(System.in);

        System.out.print("a --> ");
        a = kb.nextDouble();

        if (a != 0) {
            System.out.print("b --> ");
            b = kb.nextDouble();

            System.out.print("c --> ");
            c = kb.nextDouble();

            delta = b * b - 4 * a * c;

            if (delta >= 0) {
                x1 = (Math.sqrt(delta) - b) / (2 * a);
                if (delta == 0) {
                    x2 = x1;
                } else {
                    x2 = (-Math.sqrt(delta) - b) / (2 * a);
                }
                System.out.println("x1 = " + x1 + " x2 = " + x2);
            } else {
                System.out.println("Não há raíz real");
            }
        } else {
            System.out.println("Não é uma equação do segundo grau");
        }

        kb.close();
    }
}