package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array size: ");
        int a = scanner.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.printf("\nInput element at index position [%d]\n", i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("\n Print out initialized array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        int min = arr[0];
        int indexMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                indexMin = i;
            }
        }
        System.out.println("\nMinimum value of the array is " + min + " at the index of " + indexMin);

    }
}
