package com.codegym;

public class TestStaticProperties {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Skyactiv 3");
        Car car2 = new Car("Mazda 3", "Turbo 666");
        Car car3 = new Car("Mazda 3", "Turbo 666");
        Car car4 = new Car("Mazda 3", "Turbo 666");
        Car car5 = new Car("Mazda 3", "Turbo 666");
        System.out.println(Car.numberOfCars);
    }
}
