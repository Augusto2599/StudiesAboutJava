package arrays;

import java.util.Scanner;

public class AgendaCompromissos {
    public static void main(String[] args) {
        String[] diasDaSemana = { "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabádo", "Domingo" };
        String[][] compromissos = new String[7][0];

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Escolha uma opção:");
            System.out.println("1. Exibir compromissos");
            System.out.println("2. Cadastrar compromissos");
            System.out.println("3. Encerrar");

            Integer opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    for (int i = 0; i < compromissos.length; i++) {
                        System.out.println();
                        System.out.println(diasDaSemana[i] + ":");
                        for (String compromisso : compromissos[i]) {
                            System.out.println("- " + compromisso);
                        }
                    }
                }
                case 2 -> {
                    System.out.println();
                    System.out.println("Digite o dia da semana (1, 2, 3, 4, 5, 6, 7):");
                    Integer dia = scanner.nextInt();

                    if (dia >= 1 && dia <= 7) {
                        scanner.nextLine();
                        System.out.println("Digite o compromisso:");
                        String compromisso = scanner.nextLine();

                        Integer diaDoCompromisso = dia - 1;
                        Integer tamanhoAtual = compromissos[diaDoCompromisso].length;
                        String[] novosCompromissos = new String[tamanhoAtual + 1];
                        for (int i = 0; i < tamanhoAtual; i++) {
                            novosCompromissos[i] = compromissos[diaDoCompromisso][i];
                        }
                        novosCompromissos[tamanhoAtual] = compromisso;
                        compromissos[diaDoCompromisso] = novosCompromissos;
                    }
                }
                default -> {
                    System.out.println("Encerrando.....");
                    scanner.close();
                    return;
                }
            }
        }
    }
}
