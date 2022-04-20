package Switch;
import java.util.Scanner;

public class VogalIf {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String letra;

        System.out.print("Digite uma letra: ");
        letra = kb.next().toLowerCase();

        kb.close();

        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("É uma vogal!");
        } else {
            System.out.println("É uma consoante!");
        }
    }
}
