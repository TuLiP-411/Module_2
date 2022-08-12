package com.codegym;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6, "pink");
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "blue");

        System.out.println("Pre-sorted: ");
        for (ComparableCircle circle : circles
        ) {
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println("After sorted: ");
        for (ComparableCircle circle : circles
        ) {
            System.out.println(circle);
        }
    }
}
