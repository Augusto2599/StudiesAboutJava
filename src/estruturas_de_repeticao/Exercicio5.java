package estruturas_de_repeticao;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer numero = scanner.nextInt();;

        if (numero == 0 || numero == 1) 
            System.out.println(1);

        long fatorial = 1;
        for (int i = 2; i <= numero; i++){
            fatorial *= i;
        }

        System.out.println(fatorial);
        scanner.close();
    }
}
