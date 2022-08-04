package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Nhập số nguyên không âm có tối đa 3 chữ số bất kì: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String name;
        if (0 <= number && number < 10) {
            switch (number) {
                case 1:
                    name = "one";
                    break;
                case 2:
                    name = "two";
                    break;
                case 3:
                    name = "three";
                    break;
                case 4:
                    name = "four";
                    break;
                case 5:
                    name = "five";
                    break;
                case 6:
                    name = "six";
                    break;
                case 7:
                    name = "seven";
                    break;
                case 8:
                    name = "eight";
                    break;
                case 9:
                    name = "nine";
                    break;
                default:
                    name = "out of ability";
                    break;

            }
            System.out.printf("Cách đọc của số đã nhập là: %s", name);
        }
        if (number >= 10 && number < 20) {
            switch (number) {
                case 10:
                    name = "ten";
                    break;
                case 11:
                    name = "eleven";
                    break;
                case 12:
                    name = "twelve";
                    break;
                case 13:
                    name = "thirteen";
                    break;
                case 14:
                    name = "fourteen";
                    break;
                case 15:
                    name = "fifteen";
                    break;
                case 16:
                    name = "sixteen";
                    break;
                case 17:
                    name = "seventeen";
                    break;
                case 18:
                    name = "eighteen";
                    break;
                case 19:
                    name = "nineteen";
                    break;
                default:
                    name = "out of ability";
                    break;

            }
            System.out.printf("Cách đọc của số đã nhập là: %s", name);
        }
        if (number >= 20 && number < 100) {
            int dozen = number / 10;
            int unit = number % 10;
            String nameDozen;
            String nameUnit;
            switch (dozen) {
                case 2:
                    nameDozen = "twenty";
                    break;
                case 3:
                    nameDozen = "thirty";
                    break;
                case 4:
                    nameDozen = "forty";
                    break;
                case 5:
                    nameDozen = "fifty";
                    break;
                case 6:
                    nameDozen = "sixty";
                    break;
                case 7:
                    nameDozen = "seventy";
                    break;
                case 8:
                    nameDozen = "eighty";
                    break;
                case 9:
                    nameDozen = "ninety";
                    break;
                default:
                    nameDozen = "out of ability";
                    break;
            }
            switch (unit) {
                case 1:
                    nameUnit = "one";
                    break;
                case 2:
                    nameUnit = "two";
                    break;
                case 3:
                    nameUnit = "three";
                    break;
                case 4:
                    nameUnit = "four";
                    break;
                case 5:
                    nameUnit = "five";
                    break;
                case 6:
                    nameUnit = "six";
                    break;
                case 7:
                    nameUnit = "seven";
                    break;
                case 8:
                    nameUnit = "eight";
                    break;
                case 9:
                    nameUnit = "nine";
                    break;
                default:
                    nameUnit = "out of ability";
                    break;

            }
            System.out.printf("Cách đọc của số đã nhập là: %s %s", nameDozen, nameUnit);
        }
        if (number >= 100 && number < 1000) {
            int hundred = number / 100;
            int dozen = (number - hundred * 100) / 10;
            int unit = number % 10;
            String nameHundred;
            String nameDozen;
            String nameUnit;
            switch (hundred) {
                case 1:
                    nameHundred = "one";
                    break;
                case 2:
                    nameHundred = "two";
                    break;
                case 3:
                    nameHundred = "three";
                    break;
                case 4:
                    nameHundred = "four";
                    break;
                case 5:
                    nameHundred = "five";
                    break;
                case 6:
                    nameHundred = "six";
                    break;
                case 7:
                    nameHundred = "seven";
                    break;
                case 8:
                    nameHundred = "eight";
                    break;
                case 9:
                    nameHundred = "nine";
                    break;
                default:
                    nameHundred = "out of ability";
                    break;

            }
            switch (dozen) {
                case 2:
                    nameDozen = "twenty";
                    break;
                case 3:
                    nameDozen = "thirty";
                    break;
                case 4:
                    nameDozen = "forty";
                    break;
                case 5:
                    nameDozen = "fifty";
                    break;
                case 6:
                    nameDozen = "sixty";
                    break;
                case 7:
                    nameDozen = "seventy";
                    break;
                case 8:
                    nameDozen = "eighty";
                    break;
                case 9:
                    nameDozen = "ninety";
                    break;
                default:
                    nameDozen = "out of ability";
                    break;
            }
            switch (unit) {
                case 1:
                    nameUnit = "one";
                    break;
                case 2:
                    nameUnit = "two";
                    break;
                case 3:
                    nameUnit = "three";
                    break;
                case 4:
                    nameUnit = "four";
                    break;
                case 5:
                    nameUnit = "five";
                    break;
                case 6:
                    nameUnit = "six";
                    break;
                case 7:
                    nameUnit = "seven";
                    break;
                case 8:
                    nameUnit = "eight";
                    break;
                case 9:
                    nameUnit = "nine";
                    break;
                default:
                    nameUnit = "out of ability";
                    break;

            }
            System.out.printf("Cách đọc của số đã nhập là: %s hundred and %s %s", nameHundred, nameDozen, nameUnit);
        }
    }
}
