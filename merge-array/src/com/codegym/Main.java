package com.codegym;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input array 1's length: ");
        int length1 = scanner.nextInt();
        int[] arr1 = new int[length1];
        for (int i = 0; i < length1; i++) {
            System.out.println("Input array 1's element at index " + i);
            arr1[i] = scanner.nextInt();
        }
        System.out.println("\n Print out array 1: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
        System.out.println("\nPlease input array 2's length: ");
        int length2 = scanner.nextInt();
        int[] arr2 = new int[length2];
        for (int i = 0; i < length2; i++) {
            System.out.println("Input array 2's element at index " + i);
            arr2[i] = scanner.nextInt();
        }
        System.out.println("\n Print out array 2: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "\t");
        }
        int[] arrMerge = new int[length1 + length2];
        for (int i = 0; i < length1; i++) {
            arrMerge[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arrMerge[length1 + i] = arr2[i];
        }
        System.out.println("\n Print out array after merge: ");
        for (int i = 0; i < arrMerge.length; i++) {
            System.out.print(arrMerge[i] + "\t");
        }

    }
}
