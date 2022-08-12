package com.codegym;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("indigo", false, 3.5);
        shapes[1] = new Rectangle("orange", true, 2.5, 3.8);
        shapes[2] = new Square("yellow", true, 5.8);
        System.out.println("Before Resize and Recolor: ");
        for (Shape shape : shapes
        ) {
            System.out.println(shape.toString());
        }
        System.out.println("After Resize and Recolor: ");
        for (Shape shape : shapes
        ) {
            if (shape instanceof Circle) {
                ((Circle) shape).resize(10);
                System.out.println(((Circle) shape).howToColor());
            } else if (shape instanceof Square) {
                ((Square) shape).resize(5);
                System.out.println(((Square) shape).howToColor());
            } else if (shape instanceof Rectangle) {
                ((Rectangle) shape).resize(5);
                System.out.println(((Rectangle) shape).howToColor());
            }

            System.out.println(shape.toString());
        }
    }
}
