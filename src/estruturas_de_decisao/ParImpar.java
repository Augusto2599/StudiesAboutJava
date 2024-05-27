package estruturas_de_decisao;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor informe um número: ");
        Integer numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número informado é Par!");
        } else {
            System.out.println("O número informado é Ímpar!");
        }
        scanner.close();
    }
}
