import java.util.Scanner;

public class Expressoes2 {
    public static void main(String[] args) {
        double x, y;

        Scanner kb = new Scanner(System.in);

        System.out.print("x --> ");
        x = kb.nextDouble();

        y = Math.pow(x, 1.0 / 3.0) + Math.pow(Math.pow(x + 2, 3), 1.0 / 5);
        System.out.print("y --> " + y);

        kb.close();
    }
}
