package estruturas_de_decisao;

import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor informe Três números: ");
        Integer numeroUm = scanner.nextInt();
        Integer numeroDois = scanner.nextInt();
        Integer numeroTres = scanner.nextInt();

        if (numeroUm < numeroDois && numeroUm < numeroTres) {
            System.out.println(numeroUm);

            if (numeroDois < numeroTres) {
                System.out.println(numeroDois);
                System.out.println(numeroTres);
            } else {
                System.out.println(numeroTres);
                System.out.println(numeroDois);
            }
        } else if (numeroDois < numeroUm && numeroDois < numeroTres) {
            System.out.println(numeroDois);

            if (numeroDois < numeroTres) {
                System.out.println(numeroUm);
                System.out.println(numeroTres);
            } else {
                System.out.println(numeroTres);
                System.out.println(numeroUm);
            }
        } else {
            System.out.println(numeroTres);

            if (numeroDois < numeroDois) {
                System.out.println(numeroUm);
                System.out.println(numeroDois);
            } else {
                System.out.println(numeroDois);
                System.out.println(numeroUm);
            }
        }
        scanner.close();
    }
}
