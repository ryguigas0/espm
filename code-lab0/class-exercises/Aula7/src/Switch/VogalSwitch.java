package Switch;
import java.util.Scanner;

public class VogalSwitch {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String letra;

        System.out.print("Digite uma letra: ");
        letra = kb.next().toLowerCase();

        kb.close();

        switch (letra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("É uma vogal!");
                break;

            default:
                System.out.println("Não é uma vogal...");
                break;
        }
    }
}
