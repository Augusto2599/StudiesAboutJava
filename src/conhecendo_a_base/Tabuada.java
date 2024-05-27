package conhecendo_a_base;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número que deseja gerar a tabuada:");
        Integer numero = scanner.nextInt();

        System.out.println(numero + " x 1 = " + (1 * numero));
        System.out.println(numero + " x 2 = " + (2 * numero));
        System.out.println(numero + " x 3 = " + (3 * numero));
        System.out.println(numero + " x 4 = " + (4 * numero));
        System.out.println(numero + " x 5 = " + (5 * numero));
        System.out.println(numero + " x 6 = " + (6 * numero));
        System.out.println(numero + " x 7 = " + (7 * numero));
        System.out.println(numero + " x 8 = " + (8 * numero));
        System.out.println(numero + " x 9 = " + (9 * numero));
        System.out.println(numero + " x 10 = " + (10 * numero));

        scanner.close();
    }
}
