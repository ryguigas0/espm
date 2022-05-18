import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int input;

        do {
            System.out.print("Escreva um número positivo: ");
            input = kb.nextInt();
        } while (input <= 0);

        kb.close();

        // for (int num = 1; num <= input; num++) {
        // if (input % num == 0) {
        // System.out.println(input + " é divisível por " + num);
        // System.out.println(input + " é divisível por " + -num);
        // }
        // }

        for (int num = -input; num <= input; num++) {
            if (num != 0) {
                if (input % num == 0) {
                    System.out.println(input + " é divisível por " + num);
                }
            }
        }
    }
}
