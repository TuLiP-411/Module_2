package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a ");
        double a = scanner.nextDouble();
        System.out.println("Enter b ");
        double b = scanner.nextDouble();
        System.out.println("Enter c ");
        double c = scanner.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double delta = equation.getDiscriminant();
        if (delta > 0) {
            System.out.println("The equation has two roots " + equation.getRoot1(delta) + " and " + equation.getRoot2(delta));
        } else if (delta == 0) {
            System.out.println("The equation has one root " + equation.getRoot1(delta));
        } else System.out.println("The equation has no real roots");
    }
}
