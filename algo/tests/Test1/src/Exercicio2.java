import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double imc, peso, altura;

        System.out.print("Peso (em quilogramas): ");
        peso = kb.nextDouble();

        System.out.print("Altura (em metros): ");
        altura = kb.nextDouble();

        kb.close();

        imc = peso / (altura * altura);

        System.out.println("IMC: " + imc);
        if (imc < 25) {
            System.out.println("Esta pessoa está com o peso normal");
        } else {
            System.out.println("Esta pessoa está acima do peso normal");
        }
    }
}
