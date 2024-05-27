package estruturas_de_repeticao;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer numeroDeLinhas = scanner.nextInt();

        for (int i = 1; i <= numeroDeLinhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        scanner.close();
    }
}
