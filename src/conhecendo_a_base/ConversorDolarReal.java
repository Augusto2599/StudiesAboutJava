package conhecendo_a_base;

import java.util.Scanner;

public class ConversorDolarReal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor em Dólar: ");
        Double valorEmDolar = scanner.nextDouble();

        System.out.println("Digite a cotação do Dólar: ");
        Double cotacaoDolar = scanner.nextDouble();

        Double valorEmReal = valorEmDolar * cotacaoDolar;
        System.out.printf("O valor em reais é de R$ %.2f", valorEmReal);
        System.out.println();

        scanner.close();
    }
}
