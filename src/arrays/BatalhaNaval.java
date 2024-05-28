package arrays;

import java.util.Scanner;

public class BatalhaNaval {
    public static void main(String[] args) {
        char[][] tabuleiro = new char[5][5];
        Integer tentativas = 10;
        Integer naviosRestantes = 3;

        Scanner scanner = new Scanner(System.in);

        for (Integer i = 0; i < tabuleiro.length; i++) {
            for (Integer j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = '~';
            }
        }

        System.out.println("Informe as posições dos navios: ");

        System.out.println("Navio 1: ");
        Integer linhaNavio1 = scanner.nextInt();
        Integer colunaNavio1 = scanner.nextInt();

        System.out.println("Navio 2: ");
        Integer linhaNavio2 = scanner.nextInt();
        Integer colunaNavio2 = scanner.nextInt();

        System.out.println("Navio 3: ");
        Integer linhaNavio3 = scanner.nextInt();
        Integer colunaNavio3 = scanner.nextInt();

        tabuleiro[linhaNavio1][colunaNavio1] = 'N';
        tabuleiro[linhaNavio2][colunaNavio2] = 'N';
        tabuleiro[linhaNavio3][colunaNavio3] = 'N';

        System.out.println("Bem-vindo ao jogo de Batalha Naval!");
        System.out.println("Você tem 10 tentativas para afundar Três navios.");

        while (tentativas > 0 && naviosRestantes > 0) {
            System.out.println("\n 0 1 2 3 4");
            for (Integer i = 0; i < tabuleiro.length; i++) {
                System.out.println(i + " ");
                for (Integer j = 0; j < tabuleiro[i].length; j++) {
                    System.out.println(tabuleiro[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Tentativas restantes: " + tentativas);
            System.out.println("Informe a linha e a coluna (0-4): ");
            Integer linha = scanner.nextInt();
            Integer coluna = scanner.nextInt();

            if (linha < 0 || linha > 4 || coluna < 0 || coluna > 4) {
                System.out.println("Posição inválida. Tente Novamente!");
                continue;
            }

            if (tabuleiro[linha][coluna] == 'X') {
                System.out.println("Você já tentou essa posição. Tente Novamente!");
                continue;
            } else if (tabuleiro[linha][coluna] == 'N') {
                System.out.println("Você acertou um Navio!");
                tabuleiro[linha][coluna] = 'X';
                naviosRestantes--;
            } else {
                System.out.println("Você errou!");
                tabuleiro[linha][coluna] = 'X';
            }
            tentativas--;
        }

        if (naviosRestantes == 0) {
            System.out.println("Parabéns. Você afundou todos os Navios!");
        } else {
            System.out.println("Vish. Você perdeu. Os navios sobreviveram!");
        }

        scanner.close();
    }
}
