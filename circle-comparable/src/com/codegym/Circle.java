package com.codegym;

public class Circle {

    protected double radius = 1.0;
    protected String color = "indigo";

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        double area = radius * radius * Math.PI;
        return area;
    }

    @Override
    public String toString() {
        return "A circle with radius of "
                + radius
                + " and color of "
                + color
                + ", have area of "
                + getArea();
    }
}
