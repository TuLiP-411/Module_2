package com.codegym;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        double volume = super.getArea() * height;
        return volume;
    }

    @Override
    public String toString() {
        return "A cylinder with "
                + "height=" + height +
                ", radius=" + radius +
                ", color= " + color +
                " volume = " + getVolume()
                + " and is the subclass of "
                + super.toString();
    }
}
