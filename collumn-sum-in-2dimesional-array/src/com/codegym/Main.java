package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array size a x b. Input a: ");
        int a = scanner.nextInt();
        System.out.println("Array size a x b. Input b: ");
        int b = scanner.nextInt();
        int[][] arr = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.printf("\nInput element at index position [%d][%d]\n", i, j);
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\n Print out initialized array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        int columnIndex;
        do {
            System.out.println("\n Input column index to get sum (index from 0 to " + (arr[0].length - 1) + "): ");
            columnIndex = scanner.nextInt();
        } while (columnIndex < 0 || columnIndex > arr[0].length - 1);
        int columnSum = 0;
        for (int i = 0; i < arr.length; i++) {
            columnSum += arr[i][columnIndex];
        }
        System.out.printf("\nSum of column %d is %d\n", columnIndex, columnSum);
    }
}
