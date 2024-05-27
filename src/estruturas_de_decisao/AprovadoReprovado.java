package estruturas_de_decisao;

import java.util.Scanner;

public class AprovadoReprovado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor informe ao menos três notas:");
        Double notaUm = scanner.nextDouble();
        Double notaDois = scanner.nextDouble();
        Double notaTres = scanner.nextDouble();

        Double media = (notaUm + notaDois + notaTres) / 3;

        if (media >= 7.0)
            System.out.println("Aprovado!");
        else 
            System.out.println("Reprovado!");

        scanner.close();
    }
}
