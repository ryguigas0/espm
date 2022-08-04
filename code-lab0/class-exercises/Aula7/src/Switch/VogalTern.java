package Switch;
import java.util.Scanner;

public class VogalTern {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        String letra;

        System.out.print("Digite uma letra: ");
        letra = kb.next().toLowerCase();

        kb.close();

        System.out.println(
                (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u"))
                        ? "É uma vogal!"
                        : "É uma consonante ...");
    }
}
