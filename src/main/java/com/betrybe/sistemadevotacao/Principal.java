package com.betrybe.sistemadevotacao;

import java.util.Scanner;

public class Principal {

  /**
   * Iniciando o sitema na main.
   */
  public static void main(String[] args) {
    GerenciamentoVotacao gerenciador = new GerenciamentoVotacao();
    Scanner scanner = new Scanner(System.in);

    int option = Integer.parseInt(menuCandidato(scanner));
    while (option != 2) {
      System.out.println("Entre com o nome da pessoa candidata:");
      String nome = scanner.nextLine();
      System.out.println("Entre com o número da pessoa candidata:");
      int numero = Integer.parseInt(scanner.nextLine());
      gerenciador.cadastrarPessoaCandidata(nome, numero);
      option = Integer.parseInt(menuCandidato(scanner));
    }

    int choice = Integer.parseInt(menuEleitora(scanner));
    while (choice != 2) {
      System.out.println("Entre com o nome da pessoa eleitora:");
      String nome = scanner.nextLine();
      System.out.println("Entre com o CPF da pessoa eleitora:");
      String cpf = scanner.nextLine();
      gerenciador.cadastrarPessoaEleitora(nome, cpf);
      choice = Integer.parseInt(menuEleitora(scanner));
    }

    int selection = Integer.parseInt(menuVotacao(scanner));
    while (selection != 3) {
      if (selection == 1) {
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpf = scanner.nextLine();
        System.out.println("Entre com o número da pessoa candidata:");
        int numero = Integer.parseInt(scanner.nextLine());
        gerenciador.votar(cpf, numero);
        selection = Integer.parseInt(menuVotacao(scanner));
      } else if (selection == 2) {
        gerenciador.mostrarResultado();
        selection = Integer.parseInt(menuVotacao(scanner));
      }
    }
    gerenciador.mostrarResultado();
    scanner.close();
  }

  private static String menuCandidato(Scanner scanner) {
    System.out.println("Cadastrar pessoa candidata?");
    System.out.println("1 - Sim");
    System.out.println("2 - Não");
    System.out.println("Entre com o número correspondente à opção desejada:");
    return scanner.nextLine();
  }

  private static String menuEleitora(Scanner scanner) {
    System.out.println("Cadastrar pessoa eleitora?");
    System.out.println("1 - Sim");
    System.out.println("2 - Não");
    System.out.println("Entre com o número correspondente à opção desejada:");
    return scanner.nextLine();
  }

  private static String menuVotacao(Scanner scanner) {
    System.out.println("Entre com o número correspondente à opção desejada:");
    System.out.println("1 - Votar");
    System.out.println("2 - Resultado Parcial");
    System.out.println("3 - Finalizar Votação");
    return scanner.nextLine();
  }

}
