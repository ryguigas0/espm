import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        double y, h, x;

        Scanner kb = new Scanner(System.in);

        System.out.print("h --> ");
        h = kb.nextDouble();
        System.out.print("x --> ");
        x = kb.nextDouble();

        y = 2 * h - Math.pow((45 / (3 * x) - 4 * h * (3 - h)), 2 * h);

        System.out.println("y --> " + y);

        kb.close();
    }
}
