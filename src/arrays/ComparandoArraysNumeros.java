package arrays;

import java.util.Scanner;

public class ComparandoArraysNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho do primeiro array: ");
        Integer tamanho1 = scanner.nextInt();
        System.out.println("Informe o tamanho do segundo array: ");
        Integer tamanho2 = scanner.nextInt();

        Integer[] array1 = new Integer[tamanho1];
        Integer[] array2 = new Integer[tamanho2];

        System.out.printf("Informe %d números do array 1:%n", tamanho1);
        for (Integer i = 0; i < tamanho1; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.printf("Informe %d números do array 2:%n", tamanho2);
        for (Integer i = 0; i < tamanho2; i++) {
            array2[i] = scanner.nextInt();
        }

        for (Integer numero1 : array1) {
            for (Integer numero2 : array2) {
                if (numero1 == numero2)
                    System.out.println(numero1);
            }
        }

        scanner.close();
    }
}
