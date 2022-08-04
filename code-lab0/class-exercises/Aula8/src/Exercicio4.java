import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        int fact;

        Scanner kb = new Scanner(System.in);

        do {
            System.out.print("Número para fazer fatorial (maior ou igual a zero) --> ");
            fact = kb.nextInt();
            if (fact < -1) {
                System.out.println("Digite um número maior ou igual a zero");
            }
        } while (fact < -1);

        kb.close();

        int resultado = 1;
        if (fact > 1) {
            int counter = 1;

            while (counter <= fact) {
                resultado *= counter;
                counter++;
            }

        }

        System.out.println(fact + "! = " + resultado);
    }
}
