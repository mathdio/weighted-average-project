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
    int weightsSum = 0;
    int gradesSum = 0;

    System.out.println("Digite a quantidade de atividades para cadastrar:");
    int activityQnt = Integer.parseInt(scanner.nextLine());

    for (int i = 1; i <= activityQnt; i++) {
      System.out.println("Digite o nome da atividade " + i + ":");
      String activityName = scanner.nextLine();

      System.out.println("Digite o peso da atividade " + i + ":");
      int activityWeight = Integer.parseInt(scanner.nextLine());
      weightsSum += activityWeight;

      System.out.println("Digite a nota obtida para " + activityName + ":");
      int activityGrade = Integer.parseInt(scanner.nextLine());
      gradesSum += (activityWeight * activityGrade);
    }

    if (weightsSum != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
    }

    double finalGrade = (double) gradesSum / weightsSum;

    if (finalGrade >= 85.0) {
      System.out.println("Parabéns! Você alcançou " + finalGrade + "%! "
          + "E temos o prazer de informar que você obteve aprovação! ");
    } else {
      System.out.println("Lamentamos informar que, com base na sua pontuação alcançada neste "
          + "período, " + finalGrade + "%, você não atingiu a "
          + "pontuação mínima necessária para sua aprovação.");
    }

    scanner.close();
  }
}