import java.util.Scanner;

class Exercicio6 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);

    double renda, imposto = 0;

    System.out.print("Insira sua renda em Rombus (R$): ");
    renda = kb.nextDouble();

    kb.close();

    renda -= 2000;

    if (renda - 1000 > 0) {
      imposto += 1000 * 0.08;
    } else {
      imposto += renda * 0.08;
    }

    renda -= 1000;

    if (renda - 1500 > 0) {
      imposto += 1500 * 0.18;
    } else {
      imposto += renda * 0.18;
    }

    renda -= 1500;
    if (renda > 0) {
      imposto += renda * 0.28;
    }

    if (imposto > 0) {
      System.out.println("R$ " + String.format("%.2f", imposto));
    } else {
      System.out.println("Isento");
    }
  }
}