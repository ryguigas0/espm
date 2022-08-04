import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) throws Exception {

        Scanner kb = new Scanner(System.in);

        double empr, taxaJuros, juros = 0;
        int dias;

        while (true) {
            System.out.print("Informe o valor principal do empréstimo (-1 para terminar) -> R$ ");
            empr = kb.nextDouble();

            if (empr == -1)
                break;

            System.out.print("Informe a taxa de juros (valor entre 0 e 1) -> ");
            taxaJuros = kb.nextDouble();

            System.out.print("Informe o prazo do empréstimo em dias -> ");
            dias = kb.nextInt();

            juros = (empr * taxaJuros * dias) / 365;

            System.out.println("O valor dos juros é de R$ " + String.format("%.2f", juros));
        }

        kb.close();
    }
}
