import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int digitos, digito;
        double num = 0;

        do {
            System.out.print("Digite quantos digitos tem o número em trinário --> ");
            digitos = kb.nextInt();
        } while (digitos <= 0);

        for (int i = 0; i < digitos; i++) {
            System.out.print("Digite o digito " + (i + 1) + " (da direita para a esquerda) --> ");
            digito = kb.nextInt();
            num += digito * Math.pow(3, i);
        }

        kb.close();

        System.out.println("O número em decimal é: " + String.format("%.0f", num));
    }
}
