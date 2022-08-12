package com.codegym;

public class Circle extends Shape implements Resizeable,Colorable{
    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = radius * radius * Math.PI;
        return area;
    }

    public double getPerimeter() {
        double perimeter = radius * 2 * Math.PI;
        return perimeter;
    }

    @Override
    public String toString() {
        return "A circle with radius = "
                + getRadius()
                + " which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        radius = radius * ((100 + percent) / 100);
    }

    @Override
    public String howToColor() {
        return "Color the circle";
    }
}
