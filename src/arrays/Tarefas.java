package arrays;

import java.util.Scanner;

public class Tarefas {
    public static void main(String[] args) {
        String[] tarefas = new String[] {
            "x", "x", "x", "x", "x", "x", "x", "x", "x", "x" 
        };
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Opções: ");
            System.out.println("1. Cadastrar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Encerrar");

            Integer opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Informe o número da tarefa (1 à 10): ");
                    Integer numeroTarefa = scanner.nextInt();
                    scanner.nextLine();

                    if (numeroTarefa <= 0 || numeroTarefa > 10) {
                        System.out.println("Número da tarefa inválido.");
                        continue;
                    }

                    System.out.println("Digite a tarefa: ");
                    String tarefa = scanner.nextLine();
                    tarefas[numeroTarefa - 1] = tarefa;
                }
                case 2 -> {
                    for (Integer i = 0; i < tarefas.length; i++) {
                        System.out.printf("Tarefa %d - %s%n", i + 1, tarefas[i]);
                    }
                }
                default -> {
                    System.out.println("Encerrando o programa.....");
                    scanner.close();
                    return;
                }
            }
        }
    }
}
