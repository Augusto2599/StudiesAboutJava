package estruturas_de_repeticao;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println(0);
        } else if (numero == 1) {
            System.out.println(1);
        }

        long termoAnterior = 0;
        long termoAtual = 1;
        long termoFibonacci = 0;

        for (int i = 2; i <= numero; i++) {
            termoFibonacci = termoAnterior + termoAtual;
            termoAnterior = termoAtual;
            termoAtual = termoFibonacci;
        }

        System.out.println(termoFibonacci);

        scanner.close();
    }
}
