import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) throws Exception {
        int counter = 0, maior = 0, aux = 0;

        Scanner kb = new Scanner(System.in);

        while (counter < 15) {
            System.out.print("Insira um número inteiro --> ");
            aux = kb.nextInt();

            if (counter == 1 || aux > maior) {
                maior = aux;
            }

            counter++;
        }

        kb.close();

        System.out.println("Maior número --> " + maior);

    }
}
