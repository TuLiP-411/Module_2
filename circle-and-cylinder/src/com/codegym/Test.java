package com.codegym;

public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.toString());
        c1.setColor("yellow");
        c1.setRadius(3.5);
        System.out.println(c1.toString());

        Cylinder cy1 = new Cylinder();
        System.out.println(cy1.toString());
        cy1.setColor("blue");
        cy1.setHeight(5.6);
        cy1.setRadius(45);
        System.out.println(cy1.toString());
    }
}
