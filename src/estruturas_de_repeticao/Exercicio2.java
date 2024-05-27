package estruturas_de_repeticao;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();

        Integer soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }

        System.out.println(soma);

        scanner.close();
    }
}
