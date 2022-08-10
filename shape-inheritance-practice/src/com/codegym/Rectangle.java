package com.codegym;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        double area = width * height;
        return area;
    }

    public double getPerimeter() {
        double perimeter = (width + height) * 2;
        return perimeter;
    }

    @Override
    public String toString() {
        return "A rectangle with width = "
                + width
                + " and height = "
                + height
                + " which is a subclass of "
                + super.toString();
    }
}
