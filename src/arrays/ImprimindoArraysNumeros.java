package arrays;

import java.util.Scanner;

public class ImprimindoArraysNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer quantidade = scanner.nextInt();
        Integer[] numeros = new Integer[quantidade];

        for (Integer i = 0; i < quantidade; i++) {
            numeros[i] = scanner.nextInt();
        }

        for (Integer i = 0; i < quantidade; i++) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}
