package estruturas_de_decisao;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um ano: ");
        Integer ano = scanner.nextInt();

        if (ano % 4 != 0 || (ano % 100 == 0 && ano % 400 != 0))
            System.out.println("O ano não é bissexto!");
        else 
            System.out.println("O ano é Bissexto!");

        scanner.close();
    }
}
