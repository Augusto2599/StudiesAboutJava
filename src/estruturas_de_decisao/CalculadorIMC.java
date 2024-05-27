package estruturas_de_decisao;

import java.util.Scanner;

public class CalculadorIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor informe o seu peso e a sua altura: ");
        Double peso = scanner.nextDouble();
        Double altura = scanner.nextDouble();

        Double imc = peso / (altura * altura);

        if (imc < 18.5)
            System.out.println("A baixo do ideal");
        else if (imc >= 18.5 && imc <= 24.9)
            System.out.println("No Ideal");
        else if (imc >= 25 && imc <= 29.9)
            System.out.println("Acima do ideal");
        else if (imc >= 30 && imc <= 39.9)
            System.out.println("Obesidade");
        else
            System.out.println("Grave");

        scanner.close();
    }
}
