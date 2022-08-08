package com.codegym;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] student = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a student's name: ");
        String inputName = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(inputName)) {
                System.out.printf("Position of the students %s in the list is %d", inputName, i + 1);
                isExist = true;
                break;
            }

        }
        if (!isExist) {
            System.out.printf("Not found %s in the list", inputName);
        }
    }
}
