import java.util.Scanner;

class Exercicio2 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);

    int a, b, c, d;

    System.out.print("Escreva o valor de 'a': ");
    a = kb.nextInt();
    System.out.print("Escreva o valor de 'b': ");
    b = kb.nextInt();
    System.out.print("Escreva o valor de 'c': ");
    c = kb.nextInt();
    System.out.print("Escreva o valor de 'd': ");
    d = kb.nextInt();

    kb.close();

    if (b > c && d > a && c + d > a + b && c > 0 && d > 0 && a % 2 == 0) {
      System.out.println("Valores aceitos");
    } else {
      System.out.println("Valores nao aceitos");
    }
  }
}