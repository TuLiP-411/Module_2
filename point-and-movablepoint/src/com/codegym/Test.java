package com.codegym;

public class Test {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setXY(23f, 15f);
        System.out.println(p1.toString());

        MovablePoint p2 = new MovablePoint();
        MovablePoint p3 = (MovablePoint) p2;
        System.out.println(p3.toString());
        p3.setXY(6f, 8f);
        p3.setSpeed(3f, 4f);
        System.out.println(p3.toString());
        p3.move();
        System.out.println(p3.toString());
        p3.move();
        p3.move();
        p3.move();
        System.out.println(p3.toString());
    }
}
