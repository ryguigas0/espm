import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double celsiusMin, celsiusMax, faren;

        do {
            System.out.print("Temperatura inicial (mínima) em celsius --> ");
            celsiusMin = kb.nextDouble();
            System.out.print("Temperatura inicial (máxima) em celsius --> ");
            celsiusMax = kb.nextDouble();
        } while (celsiusMin > celsiusMax);

        kb.close();

        System.out.println();
        System.out.println("Celsius --> Fahrenheit");
        for (double i = celsiusMin; i <= celsiusMax; i++) {
            faren = 9 * i / 5 + 32;
            System.out.println(String.format("%.4f", i) + " --> " + String.format("%.4f", faren));
        }

    }
}
