import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        String nome;
        int anoNasc, anosServiço;

        Scanner kb = new Scanner(System.in);

        System.out.print("Digite o nome do empregado: ");
        nome = kb.next();

        System.out.print("Digite o ano de nascimento de " + nome + ": ");
        anoNasc = kb.nextInt();

        System.out.print("Digite quantos anos de seriço tem " + nome + ": ");
        anosServiço = kb.nextInt();

        kb.close();

        if (2022 - anoNasc >= 65 || anosServiço >= 30 || (2022 - anoNasc >= 60 && anosServiço >= 25)) {
            System.out.println("Requerer aposentadoria");
        } else {
            System.out.println("Não requerer");
        }

    }
}
