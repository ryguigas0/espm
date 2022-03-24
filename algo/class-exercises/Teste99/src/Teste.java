public class Teste {
    public static void main(String[] args) {
        // entrada
        int consumo,salarioMinimo;

        // processo
        double percent_sal_min_val;
        double valor_pra_pagar;

        consumo = 123456;
        salarioMinimo = 1212;
        percent_sal_min_val = (salarioMinimo * 2) / 100;
        valor_pra_pagar = (percent_sal_min_val * consumo) / 1000;

        // saida
        System.out.println("Você tem que pagar R$" + valor_pra_pagar);
    }
}