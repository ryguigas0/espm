import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        double x, y;

        System.out.print("x --> ");
        x = kb.nextDouble();

        y = ((2 * Math.pow(x, 2) - 3 * Math.pow(x, x + 1)) / (2)
                + (Math.sqrt(x + 1) / x)) / (Math.pow(2, x));

        System.out.println("y --> " + y);

        kb.close();
    }
}
