package com.codegym;

public class Main {

    public static void main(String[] args) {
        int number = 0;
        for (number = 0; number <= 100; number++) {
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
                System.out.println(number);

            }
        }
    }
}
