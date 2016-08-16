package com.makotogo.learn;

import java.util.Scanner;

public class ChangeJarIntermediate {

  public static void main(String[] args) {
    // Create the Scanner
    Scanner scanner = new Scanner(System.in);

    int numberOfPennies = 0;
    int numberOfNickels = 0;
    int numberOfDimes = 0;
    int numberOfQuarters = 0;

    // Number of pennies
    String message = "Enter number of pennies: ";
    prompt(message);
    String line = null;
    while (line == null) {
      line = scanner.nextLine();
      try {
        numberOfPennies = Integer.valueOf(line);
        break;
      } catch (NumberFormatException e) {
        prompt("Expected numeric value, not: '" + line + "', please try again.\n");
        line = null;
        prompt(message);
      }
    }
    // Number of nickels
    message = "Enter number of nickels: ";
    prompt(message);
    line = null; // reset
    while (line == null) {
      line = scanner.nextLine();
      try {
        numberOfNickels = Integer.valueOf(line);
        break;
      } catch (NumberFormatException e) {
        prompt("Expected numeric value, not: '" + line + "', please try again.\n");
        line = null;
        prompt(message);
      }
    }

    // Number of dimes
    message = "Enter number of dimes: ";
    prompt(message);
    line = null; // reset
    while (line == null) {
      line = scanner.nextLine();
      try {
        numberOfDimes = Integer.valueOf(line);
        break;
      } catch (NumberFormatException e) {
        prompt("Expected numeric value, not: '" + line + "', please try again.\n");
        line = null;
        prompt(message);
      }
    }

    // Number of quarters
    message = "Enter number of quarters: ";
    prompt(message);
    line = null; // reset
    while (line == null) {
      line = scanner.nextLine();
      try {
        numberOfQuarters = Integer.valueOf(line);
        break;
      } catch (NumberFormatException e) {
        prompt("Expected numeric value, not: '" + line + "', please try again.\n");
        line = null;
        prompt(message);
      }
    }

    // Close the scanner
    scanner.close();

    // Calculate the total
    int totalCents = numberOfPennies + (numberOfNickels * 5) + (numberOfDimes * 10) + (numberOfQuarters * 25);
    double dollarValue = totalCents / 100.0;

    prompt("Total cents: " + totalCents + "\n");
    prompt("Total dollar value in change jar: $" + dollarValue);

  }

  private static void prompt(String message) {
    System.out.print(message);
  }

}
