import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        double a, b,c,d,e,f, y;

        Scanner kb = new Scanner(System.in);


        System.out.print("a --> ");
        a = kb.nextDouble();
        System.out.print("b --> ");
        b = kb.nextDouble();
        System.out.print("c --> ");
        c = kb.nextDouble();
        System.out.print("d --> ");
        d = kb.nextDouble();
        System.out.print("e --> ");
        e = kb.nextDouble();
        System.out.print("f --> ");
        f = kb.nextDouble();

        y = (a + (b / c)) / (d - (e / f));

        System.out.println("y --> " + y);

        kb.close();
    }
}
