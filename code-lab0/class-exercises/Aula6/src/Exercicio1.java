import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner kb = new Scanner(System.in);

        int diarias;
        double conta;

        System.out.print("Digite quantas diárias o cliente ficou: ");
        diarias = kb.nextInt();

        kb.close();

        if (diarias > 15) {
            conta = 150 + 15.5 * diarias;
        } else if (diarias == 15) {
            conta = 150 + 36 * diarias;
        } else {
            conta = 150 + 58 * diarias;
        }

        System.out.println("Conta do cliente: " + conta);
    }
}
