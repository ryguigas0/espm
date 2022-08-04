package Switch;
import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) throws Exception {

        int mes;

        Scanner kb = new Scanner(System.in);
        System.out.print("Digite o número do dia (1 a 7): ");
        mes = kb.nextInt();

        kb.close();

        switch (mes) {
            case 1:
                System.out.println("Segunda!");
                break;

            case 2:
                System.out.println("Terça!");

                break;
            case 3:
                System.out.println("Quarta!");

                break;
            case 4:
                System.out.println("Quinta!");

                break;
            case 5:
                System.out.println("Sexta!");

                break;
            default:
                System.out.println("Digite um número entre 1 a 7");

                break;
        }

    }
}
