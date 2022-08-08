package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 0, 0, 0};
        Scanner scanner = new Scanner(System.in);
        int number, index;
        System.out.println("Input number to insert to the array: ");
        number = scanner.nextInt();
        do {
            System.out.printf("\nInput index to insert number %d to the array: ", number);
            index = scanner.nextInt();
            if (index <= -1 || index >= array.length - 1) {
                System.out.println("Please input the index in the range from 0 to " + (array.length - 1));
            }
        } while (index <= -1 || index >= array.length - 1);
        for (int i = array.length - 1; i > index - 1; i--) {
            array[i] = array[i-1];
        }
        array[index] = number;
        System.out.println("\nArray after insert number: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

}
