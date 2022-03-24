import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner kb = new Scanner(System.in);

        // int x, y, z;
        // double div;

        // System.out.println("Qual o seu nome?");
        // System.out.println("Olá " + kb.nextLine() + "!");

        // System.out.print("Primeiro número: ");
        // x = kb.nextInt();

        // System.out.print("Segundo número: ");
        // y = kb.nextInt();

        // z = x + y;
        // System.out.println("+ " + z);

        // z = x - y;
        // System.out.println("- " + z);

        // z = x * y;
        // System.out.println("* " + z);

        // z = x % y;
        // System.out.println("% " + z);

        // div = (double)x / y;
        // System.out.println("/ " + div);

        int a, b, c;
        double x;

        System.out.print("a: ");
        a = kb.nextInt();

        System.out.print("b: ");
        b = kb.nextInt();

        System.out.print("c: ");
        c = kb.nextInt();   

        x = (double) (a +
                Math.pow(b, 2)) /
                Math.pow(c, 2);

        System.out.println("x = (a + b * b) / c * c");
        System.out.println("x = " + x);
        
        kb.close();
    }
}
