package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String str = "Hom nay troi dep qua. Nang vang va gio nhe may bay";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input one character to check if it is in the string");
        char character = scanner.next().charAt(0);
        int length = str.length();
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (character == str.charAt(i)) {
                count++;
            }
        }
        System.out.printf("\nCharacter '%s' appears in string %d times", character, count);
    }
}
