package com.makotogo.learn;

import java.util.Scanner;

public class ChangeJarBasic {

  public static void main(String[] args) {
    // Create the Scanner
    Scanner scanner = new Scanner(System.in);

    // Number of pennies
    System.out.print("Enter number of pennies: ");
    int numberOfPennies = scanner.nextInt();

    // Number of nickels
    System.out.print("Enter number of nickels: ");
    int numberOfNickels = scanner.nextInt();

    // Number of dimes
    System.out.print("Enter number of dimes: ");
    int numberOfDimes = scanner.nextInt();

    // Number of quarters
    System.out.println("Enter number of quarters: ");
    int numberOfQuarters = scanner.nextInt();

    // Close the scanner
    scanner.close();

    // Calculate the total
    int totalCents = numberOfPennies + 
        numberOfNickels * 5 + 
        numberOfDimes * 10 + 
        numberOfQuarters * 25;
    double dollarValue = totalCents / 100.0;

    System.out.println("Total cents: " + totalCents);
    System.out.println("Total dollar value in change jar: $" + dollarValue);

  }

}
