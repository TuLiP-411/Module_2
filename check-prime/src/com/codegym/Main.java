package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isPrime = true;
        if (number < 2) {
            isPrime = false;
        } else if (number == 2) {
            isPrime = true;
        } else if (number % 2 == 0) {
            isPrime = false;
        } else {
            for (int i = 3; i <= number / 2; i += 2) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime == true) {
            System.out.println(number + " is a prime");
        } else {
            System.out.println(number + " is not a prime");
        }
    }

}
