import java.util.Scanner;

/**
 * Exercicio4
 */
public class Exercicio4 {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        double x, y;

        System.out.print("x --> ");
        x = kb.nextDouble();

        kb.close();

        if (5 >= x && x >= -5) {
            System.out.println("x é inválido");
        } else {
            y = (x - 8) / (Math.sqrt((x - 5) * (x + 5)));

            System.out.println("y --> " + y);
        }
    }

}