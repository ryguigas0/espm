public class App {
    public static void main(String[] args) throws Exception {
        int valor1, valor2; 
        int resultado1, resultado2, resultado3, resultado4, resultado5;

        valor1 = 7;
        valor2 = 3;

        resultado1 = valor1 + valor2;
        resultado2 = valor1 - valor2;
        resultado3 = valor1 * valor2;
        resultado4 = valor1 / valor2;
        resultado5 = valor1 % valor2;

        System.out.println(valor1 + " + " + valor2 + " = " + resultado1);
        System.out.println(valor1 + " - " + valor2 + " = " + resultado2);
        System.out.println(valor1 + " * " + valor2 + " = " + resultado3);
        System.out.println(valor1 + " / " + valor2 + " = " + resultado4);
        System.out.println(valor1 + " % " + valor2 + " = " + resultado5);
        
    }
}
