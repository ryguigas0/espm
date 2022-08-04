import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int input;

        do {
            System.out.print("Escreva um número positivo: ");
            input = kb.nextInt();
        } while (input <= 0);

        kb.close();

        boolean primo = true;

        for (int num = 2; num < input && primo; num++) {
            if (input % num == 0) {
                primo = false;
            }
        }

        if (primo) {
            System.out.println("Esse número é primo!");
        } else {
            System.out.println("Esse número não é primo!");
        }
    }
}
