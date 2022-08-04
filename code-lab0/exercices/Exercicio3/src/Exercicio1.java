import java.util.Scanner;

class Exercicio1 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);

    double a, b, c;

    System.out.print("Escreva o primeiro lado do triangulo: ");
    a = kb.nextDouble();
    System.out.print("Escreva o primeiro lado do triangulo: ");
    b = kb.nextDouble();
    System.out.print("Escreva o primeiro lado do triangulo: ");
    c = kb.nextDouble();

    kb.close();

    if (a < b + c && c < a + b && b < a + c) {
      if (a != b && a != c && b != c) {
        System.out.println("Eh um triangulo escaleno!");
      } else if (a == b && a == c && b == c) {
        System.out.println("Eh um triangulo equilatero!");
      } else {
        System.out.println("Eh um triangulo isosceles!");
      }
    } else {
      System.out.println("Isso nao eh um triangulo!");
    }
  }
}