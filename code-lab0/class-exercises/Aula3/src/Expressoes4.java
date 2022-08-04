import java.util.Scanner;

public class Expressoes4 {
    public static void main(String[] args) {

        double x, y, z;

        Scanner kb = new Scanner(System.in);

        System.out.print("x --> ");
        x = kb.nextDouble();
        System.out.print("y --> ");
        y = kb.nextDouble();

        double a = Math.pow(x, 4.0 / 5) / (x - 3);
        double b = (2 * Math.pow(x, 5) / 3) / Math.pow(x + y, 1.0 / 2);

        z = a + b;
        System.out.print("z --> " + z);

        kb.close();
    }
}
