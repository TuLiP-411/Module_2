package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice = -1;
        String style = "";
        Scanner scanner = new Scanner(System.in);
        while (choice != 4) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;

                case 2:
//                    while (style != "4") {
                    System.out.println("Choose the square triangle style: ");
                    System.out.println("'tl' for top-left square triangle");
                    System.out.println("'tr' for top-right square triangle");
                    System.out.println("'bl' for bottom-left square triangle");
                    System.out.println("'br' for bottom-right square triangle");
                    System.out.println("Enter your choice");
                    scanner.nextLine();
                    style = scanner.nextLine();
                    switch (style) {
                        case "tl":
                            for (int i = 5; i >= 1; i--) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                        case "tr":
                            for (int i = 0; i < 5; i++) {
                                for (int k = -1; k < i; k++) {
                                    System.out.print("  ");
                                }
                                for (int j = 5; j > i; j--) {
                                    System.out.print(" *");
                                }
                                System.out.println();
                            }
                            break;
                        case "bl":
                            for (int i = 1; i <= 6; i++) {
                                for (int j = 1; j < i; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                        case "br":
                            for (int i = 1; i <= 5; i++) {
                                for (int k = 5; k > i; k--) {
                                    System.out.print("  ");
                                }
                                for (int j = 1; j <= i; j++) {
                                    System.out.print(" *");
                                }
                                System.out.println();
                            }
                            break;

                        default:
                            System.out.println("No choice!");
                            break;
                    }
                    break;
                case 3:
                    for (int i = 1; i <= 5; i++) {
                        for (int k = 1; k <= 5 - i; k++) {
                            System.out.print("  ");
                        }
                        for (int j = 1; j <= (i * 2) - 1; j++) {
                            System.out.print(" *");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice!");
                    break;
            }
        }
    }
}

