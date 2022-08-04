package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int year;
        System.out.println("Enter a year: ");
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        boolean isLeapYear = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        boolean isDivisibleBy100 = year % 100 == 0;
        boolean isDivisibleBy400 = year % 400 == 0;
        if (isDivisibleBy4) {
            if (isDivisibleBy100) {
                if (isDivisibleBy400) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            System.out.printf("%s is a leap year", year);

        } else {
            System.out.printf("%s is not a leap year", year);
        }
    }
}
