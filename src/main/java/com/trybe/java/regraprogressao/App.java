package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    register();
  }

  /**
   * Method to register activities.
   */
  public static void register() {
    Scanner scanner = new Scanner(System.in);
    int weightSum = 0;

    System.out.println("Digite a quantidade de atividades para cadastrar:");
    int activityQnt = Integer.parseInt(scanner.nextLine());

    for (int i = 1; i <= activityQnt; i++) {
      System.out.println("Digite o nome da atividade " + i + ":");
      String activityName = scanner.nextLine();

      System.out.println("Digite o peso da atividade " + i + ":");
      int activityWeight = Integer.parseInt(scanner.nextLine());
      weightSum += activityWeight;

      System.out.println("Digite a nota obtida para " + activityName + ":");
      int activityGrade = Integer.parseInt(scanner.nextLine());
    }

    if (weightSum != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
    }

    scanner.close();
  }
}