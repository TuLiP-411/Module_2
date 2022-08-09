package com.codegym;

public class QuadraticEquation {
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double a, b, c;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        double delta = b * b - 4 * a * c;
        return delta;
    }

    public double getRoot1(double delta) {
        double r1 = (-b + Math.pow(delta, 0.5)) / 2 * a;
        return r1;
    }

    public double getRoot2(double delta) {
        double r2 = (-b - Math.pow(delta, 0.5)) / 2 * a;
        return r2;
    }
}
