import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int num;

        String input;

        Scanner kb = new Scanner(System.in);

        do {
            System.out.print("Escreva um número --> ");
            num = kb.nextInt();

            int mult = 0;

            while (mult <= 10) {
                System.out.println(num + " x " + mult + " = " + (num * mult));
                mult++;
            }

            System.out.print("\nFazer tabuada de outro número? (s = sim, n = não) ");
            input = kb.next();
        } while (input.toLowerCase().equals("s"));

        kb.close();
    }
}
