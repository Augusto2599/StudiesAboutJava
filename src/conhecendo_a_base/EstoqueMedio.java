package conhecendo_a_base;

import java.util.Scanner;

public class EstoqueMedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade mínima e máxima do produto: ");
        Integer quantidadeMinima = scanner.nextInt();
        Integer quantidadeMaxima = scanner.nextInt();

        Double estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2.0;

        System.out.printf("O estoque médio é de %f unidades.", estoqueMedio);

        scanner.close();
    }
}
