package estruturas_de_decisao;

import java.util.Scanner;

public class AreaFiguraGeometrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a figura (Retângulo, Triângulo ou Cículo):");
        String figuraGeometrica = scanner.next();

        switch (figuraGeometrica) {
            case "Retângulo" -> {
                System.out.println("Por favor informe a base e a altura:");
                Integer base = scanner.nextInt();
                Integer altura = scanner.nextInt();

                Integer area = base * altura;
                System.out.println(area);
            }
            case "Triângulo" -> {
                System.out.println("Por favor informe a base e a altura:");
                Integer base = scanner.nextInt();
                Integer altura = scanner.nextInt();

                Double area = (base * altura) / 2.0;
                System.out.println(area);
            }
            case "Cículo" -> {
                System.out.println("Por favor informe o raio:");
                Integer raio = scanner.nextInt();

                Double area = 3.14 * (raio * raio);
                System.out.println(area);
            }
            default -> System.out.println("Figura não suportada!");
        }

        scanner.close();
    }
}
