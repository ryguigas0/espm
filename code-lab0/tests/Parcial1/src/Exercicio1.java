import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        double c, m;
        int t, i;

        Scanner kb = new Scanner(System.in);

        System.out.print("Capital inicial (R$): ");
        c = kb.nextDouble();

        System.out.print("Taxa (decimal): ");
        i = kb.nextInt();

        System.out.print("Tempo (mêses): ");
        t = kb.nextInt();

        kb.close();

        m = c * Math.pow((1 + i / 100.0), t);

        System.out.println("Montante: R$" + String.format("%.2f", m));
    }
}
