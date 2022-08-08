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
        int max = arr[0][0];
        int indexAMax = 0;
        int indexBMax = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    indexAMax = i;
                    indexBMax = j;
                }
            }
        }
        System.out.println("Max value in array is: " + max + " at the index of [" + indexAMax + "][" + indexBMax + "]");
    }
}
