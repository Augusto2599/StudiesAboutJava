package conhecendo_a_base;

import java.util.Scanner;

public class PrecoComDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço do produto: ");
        Double preco = scanner.nextDouble();
        System.out.println("Digite a porcentagem do desconto em %: ");
        Double desconto = scanner.nextDouble();

        Double valorEconomizado = (preco * desconto) / 100;
        Double precoComDesconto = preco - valorEconomizado;

        System.out.printf("O preço do produto com o desconto será de R$ %.2f, e o valor ecconomizado foi de R$ %.2f", precoComDesconto, valorEconomizado);

        scanner.close();
    }   
}
