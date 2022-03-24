import java.util.Scanner;

public class Expressoes1 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        double x, y, z, w, q, u;

        System.out.print("x --> ");
        x = kb.nextDouble();

        System.out.print("y --> ");
        y = kb.nextDouble();

        System.out.print("u --> ");
        u = kb.nextDouble();

        System.out.print("w --> ");
        w = kb.nextDouble();

        System.out.print("q --> ");
        q = kb.nextDouble();

        kb.close();


        z = (x + y) / (u + w / q);
        System.out.println("z --> " + z);
    }
}
