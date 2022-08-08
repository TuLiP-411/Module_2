package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 86, 9, 2, 3, 5, 79, 12, 1};
        int index_del = -1;
        System.out.println("Input random number to delete in array");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                index_del = i;
            }
        }
        if (index_del == -1) {
            System.out.printf("%d does not exist in array", number);
        } else {
            System.out.printf("%d exists in array at index of %d", number, index_del);
        }
        for (int i = index_del; i <= array.length - 2; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;
        System.out.println("\nArray after delete: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
