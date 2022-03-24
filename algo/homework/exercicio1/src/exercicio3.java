import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double x, a, b, f;

        System.out.print("a --> ");
        a = kb.nextDouble();
        System.out.print("b --> ");
        b = kb.nextDouble();
        System.out.print("f --> ");
        f = kb.nextDouble();

        x = (Math.sqrt(2 * b - 4 * a) + 2 * Math.pow(f, -3)) / (3 - 2 * a);

        System.out.println("x --> " + x);
        kb.close();
    }
}
