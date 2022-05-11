import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        int fact;

        Scanner kb = new Scanner(System.in);

        do {
            System.out.print("Número para fazer fatorial (maior ou igual a zero) --> ");
            fact = kb.nextInt();
            if (fact < 0) {
                System.out.println("Digite um número maior ou igual a zero");
            }
        } while (fact < 0);

        kb.close();

        double resultado = 1;
        if (fact > 1) {
            int counter = 1;

            while (counter <= fact) {
                resultado = counter * resultado;
                counter++;
            }
            
        }

        System.out.println(fact + "! = " + resultado);
    }
}
