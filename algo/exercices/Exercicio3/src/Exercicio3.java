import java.util.Scanner;

class Exercicio3 {
  public static void main(String[] args) {

    Scanner kb = new Scanner(System.in);

    double x, y;

    System.out.print("Escreva a abscissa (x) do ponto: ");
    x = kb.nextDouble();
    System.out.print("Escreva a ordenada (y) do ponto: ");
    y = kb.nextDouble();

    kb.close();

    if (x == 0) {
      if (y == 0) {
        System.out.println("Origem");
      } else {
        System.out.println("Ordenada");
      }
    } else if (x > 0) {
      if (y > 0) {
        System.out.println("Q1");
      } else if (y < 0) {
        System.out.println("Q4");
      } else {
        System.out.println("Abscissa");
      }
    } else {
      if (y > 0) {
        System.out.println("Q2");
      } else if (y < 0) {
        System.out.println("Q3");
      } else {
        System.out.println("Abscissa");
      }
    }
  }
}