import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner kb = new Scanner(System.in);

        int diarias;
        double conta = 150;

        System.out.print("Digite quantas diárias o cliente ficou: ");
        diarias = kb.nextInt();

        kb.close();

        if (diarias > 15) {
            conta = conta + 15.5 * diarias;
        } else if (diarias == 15) {
            conta = conta + 36 * diarias;
        } else {
            conta = conta + 58 * diarias;
        }

        System.out.println("Conta do cliente: " + conta);

    }
}
