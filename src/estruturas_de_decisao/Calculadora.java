package estruturas_de_decisao;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe Dois números:");
        Integer numeroUm = scanner.nextInt();
        Integer numeroDois = scanner.nextInt();

        System.out.println("Por favor informe a operação desejada (+, -, *, /): ");
        String operador = scanner.next();

        switch (operador) {
            case "+" -> System.out.printf("%d %s %d = %d", numeroUm, operador, numeroDois, numeroUm + numeroDois);
            case "-" -> System.out.printf("%d %s %d = %d", numeroUm, operador, numeroDois, numeroUm - numeroDois);
            case "*" -> System.out.printf("%d %s %d = %d", numeroUm, operador, numeroDois, numeroUm * numeroDois);
            case "/" -> System.out.printf("%d %s %d = %d", numeroUm, operador, numeroDois, numeroUm / numeroDois);
            default -> System.out.println("Operador inválido!");
        }
        scanner.close();
    }
}
