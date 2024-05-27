package conhecendo_a_base;

import java.util.Scanner;

public class DiasDeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        Integer anosDeIdade = scanner.nextInt();
        Integer diasDeIdade = anosDeIdade * 365;
        System.out.printf("Você tem %d dias de idade!", diasDeIdade);

        scanner.close();
    }
}
