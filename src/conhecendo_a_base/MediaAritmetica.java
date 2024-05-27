package conhecendo_a_base;

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double notaUm = scanner.nextDouble();
        Double notaDois = scanner.nextDouble();
        Double notaTres = scanner.nextDouble();

        Double mediaAritmetica = (notaUm + notaDois + notaTres) / 3;
        System.out.printf("A média obtida foi %.2f", mediaAritmetica);

        scanner.close();
    }
}
