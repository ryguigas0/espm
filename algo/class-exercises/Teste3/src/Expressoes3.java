import java.util.Scanner;

/**
 * Expressoes3
 */
public class Expressoes3 {

    public static void main(String[] args) {
        double a, b, c, x;

        Scanner kb = new Scanner(System.in);

        System.out.print("a --> ");
        a = kb.nextDouble();
        System.out.print("b --> ");
        b = kb.nextDouble();
        System.out.print("c --> ");
        c = kb.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        x = (Math.pow(delta, 1.0 / 2.0) - b) / (2 * a);
        System.out.print("x --> " + x);
        
        kb.close();
    }
}