package com.codegym;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(3);
        Circle c3 = new Circle(19.8);
        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Area: " + c1.getArea());
        System.out.println("Radius: " + c2.getRadius());
        System.out.println("Area: " + c2.getArea());
        System.out.println("Radius: " + c3.getRadius());
        System.out.println("Area: " + c3.getArea());

    }
}
