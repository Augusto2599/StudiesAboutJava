package estruturas_de_repeticao;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer maiorNumero = 0;

        while (true) {
            Integer numero = scanner.nextInt();

            if (numero <= 0) {
                break;
            }

            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }

        System.out.println(maiorNumero);
        scanner.close();
    }
}
