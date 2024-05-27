package conhecendo_a_base;

import java.util.Scanner;

public class RelacionamentoDeOrdem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite Dois números: ");
        Integer numeroUm = scanner.nextInt();
        Integer numeroDois = scanner.nextInt();

        System.out.println(numeroUm + " = " + numeroDois + " ? " + (numeroUm == numeroDois));
        System.out.println(numeroUm + " != " + numeroDois + " ? " + (numeroUm != numeroDois));
        System.out.println(numeroUm + " > " + numeroDois + " ? " + (numeroUm > numeroDois));
        System.out.println(numeroUm + " < " + numeroDois + " ? " + (numeroUm < numeroDois));
        System.out.println(numeroUm + " >= " + numeroDois + " ? " + (numeroUm >= numeroDois));
        System.out.println(numeroUm + " <= " + numeroDois + " ? " + (numeroUm <= numeroDois));
        
        scanner.close();
    }
}
